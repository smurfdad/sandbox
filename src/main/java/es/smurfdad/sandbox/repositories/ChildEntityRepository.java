package es.smurfdad.sandbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.smurfdad.sandbox.entities.ChildEntity;

public interface ChildEntityRepository extends JpaRepository<ChildEntity, Long> {

    boolean existsByParent(Long parent);

}
