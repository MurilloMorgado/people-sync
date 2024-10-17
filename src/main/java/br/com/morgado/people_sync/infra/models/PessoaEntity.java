package br.com.morgado.people_sync.infra.models;

import java.util.Date;

import br.com.morgado.people_sync.domain.Pessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PESSOA")
public class PessoaEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PESSOA")
  private Long id;

  @Column(name = "NOME")
  private String nome;

  @Column(name = "IDADE")
  private String idade;

  @Column(name = "TIPO_ENDERECO")
  private String tipoEndereco;

  @Column(name = "DATA_NASCIMENTO")
  private Date dataNascimento;

  @Column(name = "CPF")
  private String cpf;

  @Column(name = "EMAIL")
  private String email;

  public Pessoa toPessoa() {

    Pessoa newPessoa = new Pessoa();

    newPessoa.setCpf(this.cpf);
    newPessoa.setDataNascimento(this.dataNascimento);
    newPessoa.setEmail(this.email);
    newPessoa.setId(this.id);
    newPessoa.setIdade(this.idade);
    newPessoa.setNome(this.nome);
    newPessoa.setTipoEndereco(this.tipoEndereco);

    return newPessoa;
  }

  public PessoaEntity(Pessoa pessoa) {
    // PessoaEntity pessoaEntity = new PessoaEntity();
    this.id = pessoa.getId();
    this.nome = pessoa.getNome();
    this.idade = pessoa.getIdade();
    this.tipoEndereco = pessoa.getTipoEndereco();
    this.dataNascimento = pessoa.getDataNascimento();
    this.cpf = pessoa.getCpf();
    this.email = pessoa.getEmail();
  }

}
