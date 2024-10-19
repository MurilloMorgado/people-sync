package br.com.morgado.people_sync.infra.exception;

public class InternalServerException extends RuntimeException {
  
  public InternalServerException(String msg){
    super(msg);
  }
}
