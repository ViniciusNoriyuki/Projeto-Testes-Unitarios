package com.aula.aplicacao.professor.mapper;

import com.aula.aplicacao.professor.model.ProfessorEntrada;
import com.aula.aplicacao.professor.model.ProfessorSaida;
import com.aula.aplicacao.professor.model.ProfessorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ProfessorMapper {

    ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

    ProfessorEntity mapToEntity(ProfessorEntrada professorEntrada);

    ProfessorSaida mapToSaida(ProfessorEntity professorEntity);

}
