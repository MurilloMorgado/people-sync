package br.com.morgado.people_sync.domain.portas.repositories;

import java.util.List;

import br.com.morgado.people_sync.domain.Pessoa;

public interface PessoaRepositoryPort {
  
  List<Pessoa> listarPessoa();
}
