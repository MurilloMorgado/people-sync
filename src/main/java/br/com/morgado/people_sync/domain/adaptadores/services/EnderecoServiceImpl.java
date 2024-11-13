package br.com.morgado.people_sync.domain.adaptadores.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.morgado.people_sync.domain.model.Endereco;
import br.com.morgado.people_sync.domain.portas.interfaces.EnderecoServicePort;
import br.com.morgado.people_sync.infra.Repositories.EnderecoRepository;

@Service
public class EnderecoServiceImpl implements EnderecoServicePort {

  private final EnderecoRepository enderecoRepository;

  private EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
    this.enderecoRepository = enderecoRepository;
  }

  @Override
  public List<Endereco> listarEnderecos() {

    List<Endereco> listaDeEnderecos = enderecoRepository.listarEnderecos();

    return listaDeEnderecos;

  }
  
    @Override
    public Endereco buscarEndereco(Long idEndereco) {
      
      Endereco endereco = enderecoRepository.buscarEndereco(idEndereco);

      return endereco;
      
    }

  @Override
  public void atualizarEndereco(Endereco endereco, Long idEndereco) {

    enderecoRepository.atualizarEndereco(endereco, idEndereco);

  }

}
