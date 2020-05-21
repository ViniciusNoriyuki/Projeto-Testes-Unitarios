package com.aula.aplicacao.professor.repository;

import com.aula.aplicacao.professor.model.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository <ProfessorEntity,Long> {

    Optional<ProfessorEntity> findByName(String nome);
}
