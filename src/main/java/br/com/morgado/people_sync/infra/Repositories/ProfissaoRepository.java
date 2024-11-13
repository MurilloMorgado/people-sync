package br.com.morgado.people_sync.infra.Repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.morgado.people_sync.domain.model.Profissao;
import br.com.morgado.people_sync.domain.portas.repositories.ProfissaoRepositoryPort;
import br.com.morgado.people_sync.infra.exception.NotFoundException;
import br.com.morgado.people_sync.infra.models.ProfissaoEntity;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProfissaoRepository implements ProfissaoRepositoryPort {

  private final ProfissaoRepositoryJpa profissaoRepositoryJpa;

  @Override
  public List<Profissao> listaDeProfissoes() {

    List<ProfissaoEntity> listaDeProfissoes = profissaoRepositoryJpa.findAll();

    return listaDeProfissoes.stream().map(ProfissaoEntity::toProfissao).collect(Collectors.toList());

  }

  @Override
  public Profissao buscProfissao(Long idProfissao) {

    ProfissaoEntity profissaoEntity = profissaoRepositoryJpa.findById(idProfissao)
        .orElseThrow(() -> new NotFoundException("Não foi possivel encontrar a profissao"));

    return profissaoEntity.toProfissao();

  }

  @Override
  public Long criarProfissao(Profissao profissao) {

    ProfissaoEntity profissaoEntity = new ProfissaoEntity(profissao);

    try {
      return profissaoRepositoryJpa.save(profissaoEntity).toProfissao().getIdProfissao();

    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falaha ao criar nossa profissão");
    }
  }

  @Override
  public void atualizarProfissao(Profissao profissao, Long idProfissao) {

    Profissao profissaoDB = buscProfissao(idProfissao);

    BeanUtils.copyProperties(profissao, profissaoDB, "idProfissao");

    try {
      ProfissaoEntity profissaoEntity = new ProfissaoEntity(profissaoDB);
      profissaoRepositoryJpa.save(profissaoEntity);
    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falha ao atualizar a profissão");
    }
  }

  @Override
  public void deletarProfissao(Long idProfissao) {
    
    try {
      profissaoRepositoryJpa.deleteById(idProfissao);
    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falha ao deletar Profissao do banco");
    }
  }

}
