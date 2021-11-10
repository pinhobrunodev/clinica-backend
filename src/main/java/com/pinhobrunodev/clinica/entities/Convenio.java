package com.pinhobrunodev.clinica.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_convenio")
public class Convenio extends  Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cnpj;
    private String telefone;

    @ManyToMany(mappedBy = "convenios")
    private Set<Paciente> pacientes = new HashSet<>();

    public Convenio() {
    }
}
