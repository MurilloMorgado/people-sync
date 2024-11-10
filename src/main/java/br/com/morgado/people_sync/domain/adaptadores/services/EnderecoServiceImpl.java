package br.com.morgado.people_sync.domain.adaptadores.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.morgado.people_sync.domain.model.Endereco;
import br.com.morgado.people_sync.domain.portas.interfaces.EnderecoServicePort;

@Service
public class EnderecoServiceImpl implements EnderecoServicePort {

  private final EnderecoServicePort enderecoServicePort;

  private EnderecoServiceImpl(EnderecoServicePort enderecoServicePort){
    this.enderecoServicePort = enderecoServicePort;
  }
  
  @Override
  public List<Endereco> listarEnderecos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarEnderecos'");
  }
  
}
