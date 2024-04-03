package com.andrade.passin.controllers;

import com.andrade.passin.dto.attendee.AttendeeBadgeResponseDTO;
import com.andrade.passin.services.AttendeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/attendees")
@AllArgsConstructor
public class AttendeeController {
  private final AttendeeService attendeeService;
  @GetMapping("/{attendeeId}/badge")
  public ResponseEntity<AttendeeBadgeResponseDTO> getAttendeeBadge(@PathVariable String attendeeId, UriComponentsBuilder uriBuilder) {
    AttendeeBadgeResponseDTO attendeeBadge = attendeeService.getAttendeeBadge(attendeeId, uriBuilder);
    return ResponseEntity.ok(attendeeBadge);
  }
}
