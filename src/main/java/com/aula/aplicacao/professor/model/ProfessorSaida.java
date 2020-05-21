package com.aula.aplicacao.professor.model;

import com.aula.aplicacao.materia.model.MateriaSaida;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorSaida {
    private Long id;
    private String nome;
    private List<MateriaSaida> materia;
}
