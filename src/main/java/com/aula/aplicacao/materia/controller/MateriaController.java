package com.aula.aplicacao.materia.controller;

import com.aula.aplicacao.materia.facade.MateriaFacade;
import com.aula.aplicacao.materia.model.MateriaEntrada;
import com.aula.aplicacao.materia.model.MateriaSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "aplicacao/materia", produces = "application/json")
@Configuration
@CrossOrigin
public class MateriaController {

    @Autowired
    MateriaFacade facade;

    @PostMapping
    MateriaSaida salvarMateria(@RequestBody MateriaEntrada materia){
        MateriaSaida saida = facade.salvar(materia);
        return saida;
    }

    @GetMapping
    List<MateriaSaida> listarMaterias() throws Exception{
        List<MateriaSaida> saida = facade.listar();
        return saida;
    }

    @PatchMapping
    MateriaSaida atualizarMateria(@RequestBody MateriaEntrada materia){
        MateriaSaida saida = facade.atualizar(materia);
        return saida;
    }
}
