package com.aula.aplicacao.professor.controller;

import com.aula.aplicacao.professor.facade.ProfessorFacade;
import com.aula.aplicacao.professor.model.ProfessorEntrada;
import com.aula.aplicacao.professor.model.ProfessorSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "aplicacao/professor", produces = "application/json")
@Configuration
@CrossOrigin
public class ProfessorController {

    @Autowired
    ProfessorFacade facade;

    @PostMapping()
    ProfessorSaida salvarProfessor(@RequestBody ProfessorEntrada professorEntrada){
            ProfessorSaida professorSaida = facade.salvar(professorEntrada);
            return professorSaida;
    }

    @GetMapping
    protected List<ProfessorSaida> listarProfessor() {
        List<ProfessorSaida> listarProfessorSaida = facade.listar();
        return listarProfessorSaida;
    }

    @PatchMapping
    protected List<ProfessorSaida> atualizarProfessor() {
        List<ProfessorSaida> listarProfessorSaida = facade.listar();
        return listarProfessorSaida;
    }


}
