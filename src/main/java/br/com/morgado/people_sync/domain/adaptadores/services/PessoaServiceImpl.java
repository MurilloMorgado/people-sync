package br.com.morgado.people_sync.domain.adaptadores.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.morgado.people_sync.domain.Pessoa;
import br.com.morgado.people_sync.domain.portas.interfaces.PessoaServicePort;
import br.com.morgado.people_sync.infra.Repositories.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaServicePort{

  private final PessoaRepository pessoaRepository;

  public PessoaServiceImpl(PessoaRepository pessoaRepository){
    this.pessoaRepository = pessoaRepository;
  }
  

  @Override
  public List<Pessoa> listarPessoa() {
    
    List<Pessoa> listaPessoa = pessoaRepository.listarPessoa();
    return listaPessoa;
    
  }
  
}
