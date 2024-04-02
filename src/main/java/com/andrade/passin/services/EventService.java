package com.andrade.passin.services;

import com.andrade.passin.domain.attendee.Attendee;
import com.andrade.passin.domain.event.Event;
import com.andrade.passin.domain.event.excepions.EventNotFoundException;
import com.andrade.passin.dto.event.EventIdDTO;
import com.andrade.passin.dto.event.EventRequestDTO;
import com.andrade.passin.dto.event.EventResponseDTO;
import com.andrade.passin.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
  private final EventRepository eventRepository;
  private final AttendeeService attendeeService;

  public EventResponseDTO getEventDescription(String eventId) {
    Event event = this.eventRepository.findById(eventId).orElseThrow(
            () -> new EventNotFoundException("Event not found with Id: " + eventId + "\""));
    List<Attendee> attendees = this.attendeeService.getAllAttendeesForEvent(eventId);
    return new EventResponseDTO(event, attendees.size());
  }

  public EventIdDTO createEvent(EventRequestDTO eventDTO) {
    Event newEvent = new Event();
    newEvent.setTitle(eventDTO.title());
    newEvent.setDescription(eventDTO.description());
    newEvent.setSlug(createSlug(eventDTO.title()));
    newEvent.setMaximumAttendees(eventDTO.maximumAttendees());

    this.eventRepository.save(newEvent);
    return new EventIdDTO(newEvent.getId());
  }

  private String createSlug(String title) {
    String normalized = Normalizer.normalize(title, Normalizer.Form.NFD);
    return normalized
            .replaceAll("[\\p{InCOMBINING_DIACRITICAL_MARKS}]", "")
            .replaceAll("[^\\w\\s]", "")
            .replaceAll("\\s+", "-")
            .toLowerCase();
  }

}
