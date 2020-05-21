package com.aula.aplicacao.aluno.repository;

import com.aula.aplicacao.aluno.model.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}