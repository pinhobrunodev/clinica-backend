package com.pinhobrunodev.clinica.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_especialidade")
public class Especialidade extends Auditable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany(mappedBy = "especialidades")
    private Set<Funcionario> medicos = new HashSet<>();

    public Especialidade() {
    }
}
