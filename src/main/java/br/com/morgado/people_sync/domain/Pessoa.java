package br.com.morgado.people_sync.domain;

import java.util.Date;

public class Pessoa {

  private Long id;

  private String nome;

  private String idade;

  private String tipoEndereco;

  private Date dataNascimento;

  private String cpf;

  private String email;

  public Pessoa() {
  }

  public Pessoa(Long id, String nome, String idade, String tipoEndereco, Date dataNascimento, String cpf,
      String email) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.tipoEndereco = tipoEndereco;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIdade() {
    return idade;
  }

  public void setIdade(String idade) {
    this.idade = idade;
  }

  public String getTipoEndereco() {
    return tipoEndereco;
  }

  public void setTipoEndereco(String tipoEndereco) {
    this.tipoEndereco = tipoEndereco;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pessoa other = (Pessoa) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  
}
