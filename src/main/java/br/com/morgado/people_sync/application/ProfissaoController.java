package br.com.morgado.people_sync.application;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.morgado.people_sync.domain.model.Profissao;
import br.com.morgado.people_sync.domain.portas.interfaces.ProfissaoServicePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "profissao")
public class ProfissaoController {

  private final ProfissaoServicePort profissaoServicePort;

  @GetMapping
  public ResponseEntity<List<Profissao>> listarProfissoes() {

    List<Profissao> listaDeProfissoes = profissaoServicePort.listarProfissoes();

    return ResponseEntity.ok().body(listaDeProfissoes);
  }

  @GetMapping(value = "{idProfissao}")
  public ResponseEntity<Profissao> buscarProfissao(@PathVariable Long idProfissao){

    Profissao profissao = profissaoServicePort.buscarProfissao(idProfissao);

    return ResponseEntity.ok().body(profissao);
  }
}
