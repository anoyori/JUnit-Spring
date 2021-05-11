package org.generation.JUnit.repository;

import org.generation.JUnit.model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}