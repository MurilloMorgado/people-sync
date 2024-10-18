package br.com.morgado.people_sync.application;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.morgado.people_sync.domain.Pessoa;
import br.com.morgado.people_sync.domain.portas.interfaces.PessoaServicePort;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "pessoa")
public class PessoaController {

  private final PessoaServicePort pessoaServicePort;

  @GetMapping
  public ResponseEntity<List<Pessoa>> listarPessoa() {
    List<Pessoa> listaDePessoas = pessoaServicePort.listarPessoa();

    return ResponseEntity.ok().body(listaDePessoas);
  }

  @GetMapping(value = "/{idPessoa}")
  public ResponseEntity<Pessoa> buscarPessoa(@PathVariable Long idPessoa) {

    Pessoa pessoa = pessoaServicePort.buscarPessoa(idPessoa);

    return ResponseEntity.ok().body(pessoa);
  }

  @PostMapping
  public ResponseEntity<Long> criarPessoa(@RequestBody Pessoa pessoa) {

    Long novaPessoa = pessoaServicePort.criarPessoa(pessoa);

    return ResponseEntity.ok().body(novaPessoa);

  }

  @PutMapping(value = "/{idPessoa}")
  public ResponseEntity<Void> atualizarPessoa(@RequestBody Pessoa pessoa, @PathVariable Long idPessoa) {

    pessoaServicePort.atualizarPessoa(pessoa, idPessoa);

    return ResponseEntity.ok().build();

  }

  @DeleteMapping("/{idPessoa}")
  public ResponseEntity<Void> deletarPessoa(@PathVariable Long idPessoa) {

    pessoaServicePort.deletarPessoa(idPessoa);

    return ResponseEntity.ok().build();

  }

}
