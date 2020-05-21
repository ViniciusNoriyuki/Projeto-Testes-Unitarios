package com.aula.aplicacao.aluno.controller;

import com.aula.aplicacao.aluno.facade.AlunoFacade;
import com.aula.aplicacao.aluno.model.AlunoEntrada;
import com.aula.aplicacao.aluno.model.AlunoSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "aplicacao/aluno", produces = "application/json")
@Configuration
@CrossOrigin
public class AlunoController {

    @Autowired
    private AlunoFacade facade;

    @GetMapping
    protected List<AlunoSaida> listar() {
        List<AlunoSaida> listaAlunoSaida = facade.listar();
        return listaAlunoSaida;
    }

    @PostMapping
    protected AlunoSaida salvar(@RequestBody AlunoEntrada alunoEntrada) {
        AlunoSaida alunoSaida = facade.salvar(alunoEntrada);
        return alunoSaida;
    }

    @PatchMapping
    protected AlunoSaida atualizar(@RequestBody AlunoEntrada alunoEntrada) {
        AlunoSaida alunoSaida = facade.atualizar(alunoEntrada);
        return alunoSaida;
    }

}