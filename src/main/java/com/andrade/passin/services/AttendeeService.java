package com.andrade.passin.services;

import com.andrade.passin.domain.attendee.Attendee;
import com.andrade.passin.domain.checkIn.CheckIn;
import com.andrade.passin.dto.attendee.AttendeeDetails;
import com.andrade.passin.dto.attendee.AttendeesListResponseDTO;
import com.andrade.passin.repositories.AttendeeRepository;
import com.andrade.passin.repositories.CheckInRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AttendeeService {
  private final AttendeeRepository attendeeRepository;
  private final CheckInRepository checkInRepository;

  public List<Attendee> getAllAttendeesForEvent(String eventId) {
    return this.attendeeRepository.findByEventId(eventId);
  }

  public AttendeesListResponseDTO getEventAttendees(String eventId) {
    List<Attendee> attendees = this.getAllAttendeesForEvent(eventId);
    List<AttendeeDetails> attendeeDetails = attendees
            .stream()
            .map(attendee -> {
              Optional<CheckIn> checkIn = this.checkInRepository.findByAttendeeId(attendee.getId());
              LocalDateTime checkInAt = checkIn.<LocalDateTime>map(CheckIn::getCreatedAt).orElse(null);
              return new AttendeeDetails(
                      attendee.getId(),
                      attendee.getName(),
                      attendee.getEmail(),
                      attendee.getCreatedAt(),
                      checkInAt);
            }).toList();
    return new AttendeesListResponseDTO(attendeeDetails);
  }

}
