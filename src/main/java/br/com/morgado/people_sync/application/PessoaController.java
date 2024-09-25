package br.com.morgado.people_sync.application;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.morgado.people_sync.domain.Pessoa;
import br.com.morgado.people_sync.domain.portas.interfaces.PessoaServicePort;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaController {

  private final PessoaServicePort pessoaServicePort;

  public PessoaController(PessoaServicePort pessoaServicePort) {
    this.pessoaServicePort = pessoaServicePort;
  }

  @GetMapping
  public ResponseEntity<List<Pessoa>> listarPessoa() {
    List<Pessoa> listaDePessoas = pessoaServicePort.listarPessoa();

    return ResponseEntity.ok().body(listaDePessoas);
  }

}
