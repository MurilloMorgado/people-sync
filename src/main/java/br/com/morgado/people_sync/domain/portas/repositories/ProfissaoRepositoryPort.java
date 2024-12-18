package br.com.morgado.people_sync.domain.portas.repositories;

import java.util.List;

import br.com.morgado.people_sync.domain.model.Profissao;

public interface ProfissaoRepositoryPort {
  
  List<Profissao> listaDeProfissoes();

  Profissao buscProfissao(Long idProfissao);

  Long criarProfissao(Profissao profissao);

  void atualizarProfissao(Profissao profissao, Long idProfissao);

  void deletarProfissao(Long idProfissao);
}
