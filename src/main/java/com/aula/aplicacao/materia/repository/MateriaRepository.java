package com.aula.aplicacao.materia.repository;

import com.aula.aplicacao.materia.model.MateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<MateriaEntity, Long> {
}
