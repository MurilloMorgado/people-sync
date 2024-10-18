package br.com.morgado.people_sync.infra.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExeptionController {

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<StandardError> handleNotFoundException(NotFoundException e, HttpServletRequest request) {

    String error = "Resource not found";
    HttpStatus status =HttpStatus.NOT_FOUND;
    StandardError err = new StandardError(error, e.getMessage(), Instant.now(), status.value(), request.getRequestURI());


    return ResponseEntity.status(status).body(err);

  }

}
