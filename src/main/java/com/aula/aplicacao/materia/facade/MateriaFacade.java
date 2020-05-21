package com.aula.aplicacao.materia.facade;

import com.aula.aplicacao.materia.mapper.MateriaMapper;
import com.aula.aplicacao.materia.model.MateriaEntity;
import com.aula.aplicacao.materia.model.MateriaEntrada;
import com.aula.aplicacao.materia.model.MateriaSaida;
import com.aula.aplicacao.materia.repository.MateriaRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MateriaFacade {
    @Autowired
    MateriaRepository repository;

    private MateriaMapper mapper = Mappers.getMapper(MateriaMapper.class);

    public MateriaSaida salvar(MateriaEntrada entrada) {
        MateriaEntity entity = mapper.toEntity(entrada);
        MateriaEntity retornoEntity = repository.save(entity);
        MateriaSaida saida = mapper.toSaida(retornoEntity);
        return saida;
    }

    public List<MateriaSaida> listar() {
        List<MateriaSaida> saida = new ArrayList<>();
        return saida;
    }

    public MateriaSaida atualizar(MateriaEntrada entrada) {
        MateriaSaida saida = new MateriaSaida();
        return saida;
    }
}
