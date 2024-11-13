package br.com.morgado.people_sync.application;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.morgado.people_sync.domain.model.Endereco;
import br.com.morgado.people_sync.domain.portas.interfaces.EnderecoServicePort;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "endereco")
public class EnderecoController {

  private final EnderecoServicePort enderecoServicePort;

  @GetMapping
  public ResponseEntity<List<Endereco>> listarEndereco() {

    List<Endereco> listaDeEnderecos = enderecoServicePort.listarEnderecos();

    return ResponseEntity.ok().body(listaDeEnderecos);

  }

  @GetMapping(value = "{idEndereco}")
  public ResponseEntity<Endereco> buscarEndereco(@PathVariable Long idEndereco) {

    Endereco endereco = enderecoServicePort.buscarEndereco(idEndereco);

    return ResponseEntity.ok().body(endereco);

  }

  @PutMapping(value = "atualizar/{idEndereco}")
  public ResponseEntity<Void> atualizarEndereco(@RequestBody Endereco endereco, @PathVariable Long idEndereco) {

    enderecoServicePort.atualizarEndereco(endereco, idEndereco);

    return ResponseEntity.ok().build();
  }

}
