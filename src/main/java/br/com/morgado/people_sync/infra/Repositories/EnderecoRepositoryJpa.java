package br.com.morgado.people_sync.infra.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.morgado.people_sync.infra.models.EnderecoEntity;

public interface EnderecoRepositoryJpa extends JpaRepository<EnderecoEntity, Long> {
  
}
