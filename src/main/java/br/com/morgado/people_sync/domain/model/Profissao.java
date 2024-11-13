package br.com.morgado.people_sync.domain.model;

public class Profissao {

  private Long idProfissao;

  private String nomeProfissao;

  public Profissao() {
  }

  public Profissao(Long idProfissao, String nomeProfissao) {
    this.idProfissao = idProfissao;
    this.nomeProfissao = nomeProfissao;
  }

  public Long getIdProfissao() {
    return idProfissao;
  }

  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  public String getNomeProfissao() {
    return nomeProfissao;
  }

  public void setNomeProfissao(String nomeProfissao) {
    this.nomeProfissao = nomeProfissao;
  }

}
