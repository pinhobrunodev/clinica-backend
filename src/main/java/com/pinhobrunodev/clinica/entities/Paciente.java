package com.pinhobrunodev.clinica.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "tb_paciente")
public class Paciente extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String rg;
    private String orgaoEmissor;
    private String cpf;
    private String telefone;
    private String celular;
    @Column(columnDefinition = "TEXT")
    private String cargoAtual;

}
