package br.com.morgado.people_sync.domain.portas.interfaces;

import java.util.List;

import br.com.morgado.people_sync.domain.model.Endereco;

public interface EnderecoServicePort {
  
  List<Endereco> listarEnderecos();
}
