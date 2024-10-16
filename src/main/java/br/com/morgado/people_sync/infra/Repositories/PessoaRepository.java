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

  public PessoaRepository(PessoaRepositoryJpa pessoaRepositoryJpa) {
    this.pessoaRepositoryJpa = pessoaRepositoryJpa;
  }

  @Override
  public List<Pessoa> listarPessoa() {
    List<PessoaEntity> listaDePessoas = pessoaRepositoryJpa.findAll();
    return listaDePessoas.stream().map(PessoaEntity::toPessoa).collect(Collectors.toList());
  }

  @Override
  public Pessoa buscarPessoa(Long idPessoa) {

    PessoaEntity pessoa = pessoaRepositoryJpa.findById(idPessoa)
        .orElseThrow(() -> new InternalError("Falha ao buscar pessoa"));

    return pessoa.toPessoa();

  }

  @Override
  public Long criarPessoa(Pessoa pessoa) {

    PessoaEntity newPessoa = new PessoaEntity(pessoa);

    try {
      return pessoaRepositoryJpa.save(newPessoa).toPessoa().getId();
    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falha ao criar pessoa");
    }

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
