package br.com.morgado.people_sync.infra.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.morgado.people_sync.infra.models.ProfissaoEntity;

public interface ProfissaoRepositoryJpa extends JpaRepository<ProfissaoEntity, Long> {
  
}
