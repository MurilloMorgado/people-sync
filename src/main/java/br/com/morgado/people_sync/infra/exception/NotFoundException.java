package br.com.morgado.people_sync.infra.exception;

public class NotFoundException extends RuntimeException {
  
  public NotFoundException(String msg){
    super(msg);
  }

}
