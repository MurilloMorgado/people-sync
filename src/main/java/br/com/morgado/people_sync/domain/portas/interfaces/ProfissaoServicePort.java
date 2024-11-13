package br.com.morgado.people_sync.domain.portas.interfaces;

import java.util.List;

import br.com.morgado.people_sync.domain.model.Profissao;

public interface ProfissaoServicePort {
  
  List<Profissao> listarProfissoes();
}
