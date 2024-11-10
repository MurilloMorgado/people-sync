package br.com.morgado.people_sync.infra.Repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.morgado.people_sync.domain.model.Endereco;
import br.com.morgado.people_sync.domain.portas.repositories.EnderecoRepositoryPort;
import br.com.morgado.people_sync.infra.models.EnderecoEntity;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EnderecoRepository implements EnderecoRepositoryPort {

  private final EnderecoRepositoryJpa enderecoRepositoryJpa;

  @Override
  public List<Endereco> listarEnderecos() {

    List<EnderecoEntity> listaDeEnderecos = enderecoRepositoryJpa.findAll();

    return listaDeEnderecos.stream().map(EnderecoEntity::toEndereco).collect(Collectors.toList());

  }

}
