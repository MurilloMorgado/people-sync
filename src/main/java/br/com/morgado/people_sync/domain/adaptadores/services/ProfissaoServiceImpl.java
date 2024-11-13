package br.com.morgado.people_sync.domain.adaptadores.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.morgado.people_sync.domain.model.Profissao;
import br.com.morgado.people_sync.domain.portas.interfaces.ProfissaoServicePort;
import br.com.morgado.people_sync.domain.portas.repositories.ProfissaoRepositoryPort;

@Service
public class ProfissaoServiceImpl implements ProfissaoServicePort {

  private final ProfissaoRepositoryPort profissaoRepository;

  public ProfissaoServiceImpl(ProfissaoRepositoryPort profissaoRepositoryPort) {
    this.profissaoRepository = profissaoRepositoryPort;
  }

  @Override
  public List<Profissao> listarProfissoes() {

    List<Profissao> listaDeProfissoes = profissaoRepository.listaDeProfissoes();

    return listaDeProfissoes;
  }

  @Override
  public Profissao buscarProfissao(Long idProfissao) {

    Profissao profissao = profissaoRepository.buscProfissao(idProfissao);

    return profissao;
  }

  @Override
  public Long criarProfissao(Profissao profissao) {

    Long idProfissao = profissaoRepository.criarProfissao(profissao);

    return idProfissao;

  }

  @Override
  public void atualizarProfissao(Profissao profissao, Long idProfissao) {

    profissaoRepository.atualizarProfissao(profissao, idProfissao);

  }

  @Override
  public void deletarProfissao(Long idProfissao) {
    
    profissaoRepository.deletarProfissao(idProfissao);
    
  }

}
