package br.com.morgado.people_sync.infra.Repositories;

import java.util.List;
import java.util.stream.Collectors;

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

}
