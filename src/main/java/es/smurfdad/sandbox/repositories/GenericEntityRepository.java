package es.smurfdad.sandbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.smurfdad.sandbox.entities.GenericEntity;

public interface GenericEntityRepository extends JpaRepository<GenericEntity, Long> {

}
