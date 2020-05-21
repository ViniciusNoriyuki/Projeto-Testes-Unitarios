package com.aula.aplicacao.materia.mapper;

import com.aula.aplicacao.materia.model.MateriaEntity;
import com.aula.aplicacao.materia.model.MateriaEntrada;
import com.aula.aplicacao.materia.model.MateriaSaida;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-31T11:12:16-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (N/A)"
)
public class MateriaMapperImpl implements MateriaMapper {

    @Override
    public MateriaEntity toEntity(MateriaEntrada entrada) {
        if ( entrada == null ) {
            return null;
        }

        MateriaEntity materiaEntity = new MateriaEntity();

        materiaEntity.setNome( entrada.getNome() );

        return materiaEntity;
    }

    @Override
    public MateriaSaida toSaida(MateriaEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MateriaSaida materiaSaida = new MateriaSaida();

        materiaSaida.setId( entity.getId() );

        return materiaSaida;
    }
}
