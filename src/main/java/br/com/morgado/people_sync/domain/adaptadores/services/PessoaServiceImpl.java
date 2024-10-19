package br.com.morgado.people_sync.domain.adaptadores.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.morgado.people_sync.domain.Pessoa;
import br.com.morgado.people_sync.domain.portas.interfaces.PessoaServicePort;
import br.com.morgado.people_sync.infra.Repositories.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaServicePort {

  private final PessoaRepository pessoaRepository;

  public PessoaServiceImpl(PessoaRepository pessoaRepository) {
    this.pessoaRepository = pessoaRepository;
  }

  @Override
  public List<Pessoa> listarPessoa() {

    List<Pessoa> listaPessoa = pessoaRepository.listarPessoa();
    return listaPessoa;

  }

  @Override
  public Pessoa buscarPessoa(Long idPessoa) {

    return pessoaRepository.buscarPessoa(idPessoa);

  }

  @Override
  public Long criarPessoa(Pessoa pessoa) {

    return pessoaRepository.criarPessoa(pessoa);

  }

  @Override
  public void atualizarPessoa(Pessoa pessoa, Long idPessoa) {

    buscarPessoa(idPessoa); // Metodo apenas para verificar se pessoa existe no DB

    pessoaRepository.atualizarPessoa(pessoa, idPessoa);

  }

  @Override
  public void deletarPessoa(Long idPessoa) {

    buscarPessoa(idPessoa); // Metodo apenas para verificar se pessoa existe no DB

    pessoaRepository.deletarPessoa(idPessoa);

  }

}
