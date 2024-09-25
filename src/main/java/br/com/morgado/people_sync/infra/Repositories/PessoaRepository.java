package br.com.morgado.people_sync.infra.Repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.morgado.people_sync.domain.Pessoa;
import br.com.morgado.people_sync.domain.portas.repositories.PessoaRepositoryPort;
import br.com.morgado.people_sync.infra.models.PessoaEntity;

@Component
public class PessoaRepository implements PessoaRepositoryPort {

  private final PessoaRepositoryJpa pessoaRepositoryJpa;

  public PessoaRepository(PessoaRepositoryJpa pessoaRepositoryJpa){
    this.pessoaRepositoryJpa = pessoaRepositoryJpa;
  }

  @Override
  public List<Pessoa> listarPessoa() {
   List<PessoaEntity> listaDePessoas = pessoaRepositoryJpa.findAll();
   return listaDePessoas.stream().map(PessoaEntity::toPessoa).collect(Collectors.toList());
  }

  @Override
  public Pessoa buscarPessoa(Long idPessoa) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarPessoa'");
  }

  @Override
  public Long criarPessoa(Pessoa pessoa) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarPessoa'");
  }

  @Override
  public void atualizarPessoa(Pessoa pessoa, Long idPessoa) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarPessoa'");
  }

  @Override
  public void deletarPessoa(Long idPessoa) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarPessoa'");
  }

}
