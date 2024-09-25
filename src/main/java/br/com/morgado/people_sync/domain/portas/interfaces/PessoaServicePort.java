package br.com.morgado.people_sync.domain.portas.interfaces;

import java.util.List;

import br.com.morgado.people_sync.domain.Pessoa;


public interface PessoaServicePort {
  
  List<Pessoa> listarPessoa();
}
