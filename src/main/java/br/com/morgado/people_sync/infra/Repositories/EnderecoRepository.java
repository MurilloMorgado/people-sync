package br.com.morgado.people_sync.infra.Repositories;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.morgado.people_sync.domain.model.Endereco;
import br.com.morgado.people_sync.domain.portas.repositories.EnderecoRepositoryPort;

@Component
public class EnderecoRepository implements EnderecoRepositoryPort{

  @Override
  public List<Endereco> listarEnderecos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarEnderecos'");
  }
  
}
