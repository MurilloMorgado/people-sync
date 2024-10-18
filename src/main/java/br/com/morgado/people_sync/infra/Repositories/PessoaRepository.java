package br.com.morgado.people_sync.infra.Repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.morgado.people_sync.domain.Pessoa;
import br.com.morgado.people_sync.domain.portas.repositories.PessoaRepositoryPort;
import br.com.morgado.people_sync.infra.exception.NotFoundException;
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
        .orElseThrow(() -> new NotFoundException("Falha ao buscar pessoa"));

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

    try {
      Pessoa pessoaDB = buscarPessoa(idPessoa);

      PessoaEntity newPessoa = new PessoaEntity(pessoaDB);

      BeanUtils.copyProperties(pessoa, newPessoa, "id");
      pessoaRepositoryJpa.save(newPessoa);
    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError("Falha ao atualizar Pessoa com ID : " + idPessoa);
    }

  }

  @Override
  public void deletarPessoa(Long idPessoa) {

    pessoaRepositoryJpa.deleteById(idPessoa);

  }

}
