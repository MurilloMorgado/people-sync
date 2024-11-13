package br.com.morgado.people_sync.domain.adaptadores.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.morgado.people_sync.domain.model.Profissao;
import br.com.morgado.people_sync.domain.portas.interfaces.ProfissaoServicePort;
import br.com.morgado.people_sync.domain.portas.repositories.ProfissaoRepositoryPort;

@Service
public class ProfissaoServiceImpl implements ProfissaoServicePort {

  private final ProfissaoRepositoryPort profissaoRepositoryPort;

  public ProfissaoServiceImpl(ProfissaoRepositoryPort profissaoRepositoryPort) {
    this.profissaoRepositoryPort = profissaoRepositoryPort;
  }

  @Override
  public List<Profissao> listarProfissoes() {

    List<Profissao> listaDeProfissoes = profissaoRepositoryPort.listaDeProfissoes();

    return listaDeProfissoes;
  }

  @Override
  public Profissao buscarProfissao(Long idProfissao) {
    
    Profissao profissao = profissaoRepositoryPort.buscProfissao(idProfissao);

    return profissao;
  }

}
