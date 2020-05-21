package com.aula.aplicacao.aluno.mapper;

import com.aula.aplicacao.aluno.model.AlunoEntity;
import com.aula.aplicacao.aluno.model.AlunoEntrada;
import com.aula.aplicacao.aluno.model.AlunoSaida;
import com.aula.aplicacao.materia.model.MateriaEntity;
import com.aula.aplicacao.materia.model.MateriaSaida;
import com.aula.aplicacao.professor.model.ProfessorEntity;
import com.aula.aplicacao.professor.model.ProfessorSaida;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-31T11:12:16-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 13.0.2 (N/A)"
)
public class AlunoMapperImpl implements AlunoMapper {

    @Override
    public AlunoEntity mapToEntity(AlunoEntrada alunoEntrada) {
        if ( alunoEntrada == null ) {
            return null;
        }

        AlunoEntity alunoEntity = new AlunoEntity();

        alunoEntity.setNome( alunoEntrada.getNome() );

        return alunoEntity;
    }

    @Override
    public AlunoSaida mapToSaida(AlunoEntity criadorEntidade) {
        if ( criadorEntidade == null ) {
            return null;
        }

        AlunoSaida alunoSaida = new AlunoSaida();

        alunoSaida.setId( criadorEntidade.getId() );
        alunoSaida.setNome( criadorEntidade.getNome() );
        alunoSaida.setProfessores( professorEntityListToProfessorSaidaList( criadorEntidade.getProfessores() ) );

        return alunoSaida;
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

    protected ProfessorSaida professorEntityToProfessorSaida(ProfessorEntity professorEntity) {
        if ( professorEntity == null ) {
            return null;
        }

        ProfessorSaida professorSaida = new ProfessorSaida();

        professorSaida.setId( professorEntity.getId() );
        professorSaida.setNome( professorEntity.getNome() );
        professorSaida.setMateria( materiaEntityListToMateriaSaidaList( professorEntity.getMateria() ) );

        return professorSaida;
    }

    protected List<ProfessorSaida> professorEntityListToProfessorSaidaList(List<ProfessorEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ProfessorSaida> list1 = new ArrayList<ProfessorSaida>( list.size() );
        for ( ProfessorEntity professorEntity : list ) {
            list1.add( professorEntityToProfessorSaida( professorEntity ) );
        }

        return list1;
    }
}
