package br.com.morgado.people_sync.infra.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

  private String error;
  private String message;
  private Instant timesTamp;
  private Integer status;
  private String path;

  public StandardError() {
  }

  public StandardError(String error, String message, Instant timesTamp, Integer status, String path) {
    this.error = error;
    this.message = message;
    this.timesTamp = timesTamp;
    this.status = status;
    this.path = path;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Instant getTimesTamp() {
    return timesTamp;
  }

  public void setTimesTamp(Instant timesTamp) {
    this.timesTamp = timesTamp;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

}
