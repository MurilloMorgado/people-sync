package br.com.morgado.people_sync.infra.models;

import br.com.morgado.people_sync.domain.model.Profissao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROFISSAO")
public class ProfissaoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PROFISSAO")
  private Long idProfissao;

  @Column(name = "NOME_PROFISSAO")
  private String nomeProfissao;


  public Profissao toProfissao(){
    Profissao profissao = new Profissao();

    profissao.setIdProfissao(idProfissao);
    profissao.setNomeProfissao(nomeProfissao);

    return profissao;
  }

  public ProfissaoEntity(Profissao profissao) {
    this.idProfissao = profissao.getIdProfissao();
    this.nomeProfissao = profissao.getNomeProfissao();
  }
}
