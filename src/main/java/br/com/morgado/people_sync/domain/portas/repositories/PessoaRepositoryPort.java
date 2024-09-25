package br.com.morgado.people_sync.domain.portas.repositories;

import java.util.List;

import br.com.morgado.people_sync.domain.Pessoa;

public interface PessoaRepositoryPort {
  
  List<Pessoa> listarPessoa();

  Pessoa buscarPessoa(Long idPessoa);

  Long criarPessoa(Pessoa pessoa);

  void atualizarPessoa(Pessoa pessoa, Long idPessoa);

  void deletarPessoa(Long idPessoa);


}
