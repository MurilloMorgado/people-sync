package br.com.morgado.people_sync.domain.model;

public class Endereco {

  private Long id;

  private String numero;

  private String logradouro;

  private String cidade;

  private String estado;

  private String pais;

  public Endereco() {
  }

  public Endereco(Long id, String numero, String logradouro, String cidade, String estado, String pais) {
    this.id = id;
    this.numero = numero;
    this.logradouro = logradouro;
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

}
