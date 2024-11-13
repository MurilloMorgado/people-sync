package br.com.morgado.people_sync.infra.Repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.boot.beanvalidation.IntegrationException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.morgado.people_sync.domain.model.Endereco;
import br.com.morgado.people_sync.domain.portas.repositories.EnderecoRepositoryPort;
import br.com.morgado.people_sync.infra.exception.NotFoundException;
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

  @Override
  public Endereco buscarEndereco(Long idEndereco) {

    EnderecoEntity enderecoEntity = enderecoRepositoryJpa.findById(idEndereco)
        .orElseThrow(() -> new NotFoundException("Endereco não encontrado"));

    return enderecoEntity.toEndereco();
  }

  @Override
  public Long criarEndereco(Endereco endereco) {

    EnderecoEntity enderecoEntity = new EnderecoEntity(endereco);

    try {
      return enderecoRepositoryJpa.save(enderecoEntity).toEndereco().getId();
    } catch (Exception e) {
      e.printStackTrace();
      throw new IntegrationException("Falha ao criar novo endereço");
    }

  }

  @Override
  public void atualizarEndereco(Endereco endereco, Long idEndereco) {

    Endereco enderecoDB = buscarEndereco(idEndereco);

    BeanUtils.copyProperties(endereco, enderecoDB, "id");

    try {

      EnderecoEntity enderecoEntity = new EnderecoEntity(enderecoDB);

      enderecoRepositoryJpa.save(enderecoEntity);

    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falha ao atualizar endereco no Banco");
    }

  }

  @Override
  public void deletarEndereco(Long idEndereco) {
    
    try {
    enderecoRepositoryJpa.deleteById(idEndereco);      
    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falha ao deletar o endereço do banco");
    }
  }

}
