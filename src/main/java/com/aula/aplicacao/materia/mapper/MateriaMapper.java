package com.aula.aplicacao.materia.mapper;

import com.aula.aplicacao.materia.model.MateriaEntity;
import com.aula.aplicacao.materia.model.MateriaEntrada;
import com.aula.aplicacao.materia.model.MateriaSaida;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MateriaMapper {
    MateriaMapper INSTANCE = Mappers.getMapper(MateriaMapper.class);

    MateriaEntity toEntity(MateriaEntrada entrada);

    MateriaSaida toSaida(MateriaEntity entity);
}
