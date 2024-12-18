package br.com.morgado.people_sync.domain.portas.interfaces;

import java.util.List;

import br.com.morgado.people_sync.domain.model.Profissao;

public interface ProfissaoServicePort {
  
  List<Profissao> listarProfissoes();

  Profissao buscarProfissao(Long idProfissao);

  Long criarProfissao(Profissao profissao);

  void atualizarProfissao(Profissao profissao, Long idProfissao);

  void deletarProfissao(Long idProfissao);
}
