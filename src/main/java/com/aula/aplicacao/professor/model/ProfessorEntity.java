package com.aula.aplicacao.professor.model;

import com.aula.aplicacao.materia.model.MateriaEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="professor")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name= "nome")
    String nome;

    @OneToMany
    @Column(name = "materia")
    List<MateriaEntity> materia;

}
