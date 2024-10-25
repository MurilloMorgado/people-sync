package br.com.morgado.people_sync.infra.models;

import br.com.morgado.people_sync.domain.model.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class EnderecoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_ENDERECO")
  private Long id;

  @Column(name = "NUMERO")
  private String numero;

  @Column(name = "LOGRADOURO")
  private String logradouro;

  @Column(name = "CIDADE")
  private String cidade;

  @Column(name = "ESTADO")
  private String estado;

  @Column(name = "PAIS")
  private String pais;

  public EnderecoEntity(Endereco endereco) {
    this.id = endereco.getId();
    this.numero = endereco.getNumero();
    this.logradouro = endereco.getLogradouro();
    this.cidade = endereco.getCidade();
    this.estado = endereco.getEstado();
    this.pais = endereco.getPais();
  }

  public Endereco toEndereco() {

    Endereco newEndereco = new Endereco();

    newEndereco.setId(id);
    newEndereco.setNumero(numero);
    newEndereco.setLogradouro(logradouro);
    newEndereco.setCidade(cidade);
    newEndereco.setPais(pais);

    return newEndereco;

  }

}
