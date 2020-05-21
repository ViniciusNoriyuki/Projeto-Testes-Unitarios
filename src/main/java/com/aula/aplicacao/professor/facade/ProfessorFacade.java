package com.aula.aplicacao.professor.facade;

import com.aula.aplicacao.materia.mapper.MateriaMapper;
import com.aula.aplicacao.professor.mapper.ProfessorMapper;
import com.aula.aplicacao.professor.model.ProfessorEntrada;
import com.aula.aplicacao.professor.model.ProfessorSaida;
import com.aula.aplicacao.professor.model.ProfessorEntity;
import com.aula.aplicacao.professor.repository.ProfessorRepository;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfessorFacade {
    @Autowired
    ProfessorRepository professorRepository;

    ProfessorMapper mapper = Mappers.getMapper(ProfessorMapper.class);

    public ProfessorSaida salvar(ProfessorEntrada professorEntrada)  {

        return null;

    }


    public List<ProfessorSaida> listar() {
        List<ProfessorEntity> listarProfessorEntity = professorRepository.findAll();
        List<ProfessorSaida> listarProfessorSaida = new ArrayList<>();
        for (ProfessorEntity professorEntity : listarProfessorEntity) {
            mapper.mapToSaida(professorEntity);
        }
        return listarProfessorSaida;
    }

    public ProfessorSaida atualizar(ProfessorEntrada entrada) throws Exception {

        List<ProfessorEntity> listaProfessorEntity =new ArrayList<>();
            Optional<ProfessorEntity> optionalHeroiEntity = professorRepository.findByName(entrada.getNome());
            if(optionalHeroiEntity.isPresent()){
                listaProfessorEntity.add(optionalHeroiEntity.get());
            }else {
                throw new Exception("Professor nao encontrado(a)");
            }
            ProfessorSaida saida = new ProfessorSaida();
        return saida;
    }


}
