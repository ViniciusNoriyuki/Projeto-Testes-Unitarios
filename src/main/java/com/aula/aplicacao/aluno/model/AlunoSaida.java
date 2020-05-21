package com.aula.aplicacao.aluno.model;

import com.aula.aplicacao.professor.model.ProfessorSaida;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlunoSaida {
    private Long id;
    private String nome;
    private List<ProfessorSaida> professores;
}