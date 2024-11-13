package br.com.morgado.people_sync.domain.portas.repositories;

import java.util.List;

import br.com.morgado.people_sync.domain.model.Endereco;

public interface EnderecoRepositoryPort {

  List<Endereco> listarEnderecos();

  Endereco buscarEndereco(Long idEndereco);

  Long criarEndereco(Endereco endereco);

  void atualizarEndereco(Endereco endereco, Long idEndereco);

}
