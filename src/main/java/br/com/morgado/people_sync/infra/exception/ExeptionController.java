package br.com.morgado.people_sync.infra.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExeptionController {

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<StandardError> handleNotFoundException(NotFoundException e, HttpServletRequest request) {

    String error = "Resource not found";
    HttpStatus status = HttpStatus.NOT_FOUND;

    StandardError err = new StandardError(error, e.getMessage(), Instant.now(), status.value(),
        request.getRequestURI());

    return ResponseEntity.status(status).body(err);

  }

  @ExceptionHandler(InternalServerError.class)
  public ResponseEntity<StandardError> handleInternalServerException(InternalServerError  e,
      HttpServletRequest request) {

    String error = "Internal Server Error";
    HttpStatus status = HttpStatus.BAD_REQUEST;

    StandardError err = new StandardError(error, e.getMessage(), Instant.now(), status.value(),
        request.getRequestURI());
        err.setPath(request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }

}
