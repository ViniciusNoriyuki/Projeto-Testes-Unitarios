package com.aula.aplicacao.professor.model;

import com.aula.aplicacao.materia.model.MateriaEntrada;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorEntrada {
    String nome;
    List<MateriaEntrada> materia;
}
