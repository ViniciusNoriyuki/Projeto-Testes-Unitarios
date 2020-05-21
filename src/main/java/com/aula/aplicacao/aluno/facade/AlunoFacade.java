package com.aula.aplicacao.aluno.facade;

import com.aula.aplicacao.aluno.mapper.AlunoMapper;
import com.aula.aplicacao.aluno.model.AlunoEntrada;
import com.aula.aplicacao.aluno.repository.AlunoRepository;
import com.aula.aplicacao.aluno.model.AlunoSaida;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoFacade {

    @Autowired
    private AlunoRepository alunoRepository;

    AlunoMapper mapper = Mappers.getMapper(AlunoMapper.class);

    public AlunoSaida salvar(AlunoEntrada alunoEntrada) {
        return null;
    }

    public List<AlunoSaida> listar() {
        return null;
    }

    public AlunoSaida atualizar(AlunoEntrada alunoEntrada) {
        return null;
    }

}