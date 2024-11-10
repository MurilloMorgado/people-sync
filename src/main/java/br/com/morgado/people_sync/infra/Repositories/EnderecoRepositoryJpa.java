package br.com.morgado.people_sync.infra.Repositories;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

import br.com.morgado.people_sync.infra.models.EnderecoEntity;

public interface EnderecoRepositoryJpa extends JpaAttributeConverter<Long, EnderecoEntity> {
  
}
