package com.aula.aplicacao.professor.mapper;

import com.aula.aplicacao.materia.model.MateriaEntity;
import com.aula.aplicacao.materia.model.MateriaEntrada;
import com.aula.aplicacao.materia.model.MateriaSaida;
import com.aula.aplicacao.professor.model.ProfessorEntity;
import com.aula.aplicacao.professor.model.ProfessorEntrada;
import com.aula.aplicacao.professor.model.ProfessorSaida;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-31T11:12:16-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (N/A)"
)
public class ProfessorMapperImpl implements ProfessorMapper {

    @Override
    public ProfessorEntity mapToEntity(ProfessorEntrada professorEntrada) {
        if ( professorEntrada == null ) {
            return null;
        }

        ProfessorEntity professorEntity = new ProfessorEntity();

        professorEntity.setNome( professorEntrada.getNome() );
        professorEntity.setMateria( materiaEntradaListToMateriaEntityList( professorEntrada.getMateria() ) );

        return professorEntity;
    }

    @Override
    public ProfessorSaida mapToSaida(ProfessorEntity professorEntity) {
        if ( professorEntity == null ) {
            return null;
        }

        ProfessorSaida professorSaida = new ProfessorSaida();

        professorSaida.setId( professorEntity.getId() );
        professorSaida.setNome( professorEntity.getNome() );
        professorSaida.setMateria( materiaEntityListToMateriaSaidaList( professorEntity.getMateria() ) );

        return professorSaida;
    }

    protected MateriaEntity materiaEntradaToMateriaEntity(MateriaEntrada materiaEntrada) {
        if ( materiaEntrada == null ) {
            return null;
        }

        MateriaEntity materiaEntity = new MateriaEntity();

        materiaEntity.setNome( materiaEntrada.getNome() );

        return materiaEntity;
    }

    protected List<MateriaEntity> materiaEntradaListToMateriaEntityList(List<MateriaEntrada> list) {
        if ( list == null ) {
            return null;
        }

        List<MateriaEntity> list1 = new ArrayList<MateriaEntity>( list.size() );
        for ( MateriaEntrada materiaEntrada : list ) {
            list1.add( materiaEntradaToMateriaEntity( materiaEntrada ) );
        }

        return list1;
    }

    protected MateriaSaida materiaEntityToMateriaSaida(MateriaEntity materiaEntity) {
        if ( materiaEntity == null ) {
            return null;
        }

        MateriaSaida materiaSaida = new MateriaSaida();

        materiaSaida.setId( materiaEntity.getId() );

        return materiaSaida;
    }

    protected List<MateriaSaida> materiaEntityListToMateriaSaidaList(List<MateriaEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<MateriaSaida> list1 = new ArrayList<MateriaSaida>( list.size() );
        for ( MateriaEntity materiaEntity : list ) {
            list1.add( materiaEntityToMateriaSaida( materiaEntity ) );
        }

        return list1;
    }
}
