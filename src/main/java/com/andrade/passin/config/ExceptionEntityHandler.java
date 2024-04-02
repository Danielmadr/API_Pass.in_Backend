package com.andrade.passin.config;

import com.andrade.passin.domain.event.excepions.EventNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionEntityHandler {

  @ExceptionHandler(EventNotFoundException.class)
  public ResponseEntity<?> handleEventNotFoundException(EventNotFoundException ex) {
    return ResponseEntity.notFound().build();
  }
}
