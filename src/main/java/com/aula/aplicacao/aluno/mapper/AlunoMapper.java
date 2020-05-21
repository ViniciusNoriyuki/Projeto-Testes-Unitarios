package com.aula.aplicacao.aluno.mapper;

import com.aula.aplicacao.aluno.model.AlunoEntity;
import com.aula.aplicacao.aluno.model.AlunoEntrada;
import com.aula.aplicacao.aluno.model.AlunoSaida;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoMapper {

    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);


    AlunoEntity mapToEntity(AlunoEntrada alunoEntrada);


    AlunoSaida mapToSaida(AlunoEntity criadorEntidade);
}