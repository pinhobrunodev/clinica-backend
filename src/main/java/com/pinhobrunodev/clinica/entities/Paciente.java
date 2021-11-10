package com.pinhobrunodev.clinica.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


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
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    public Paciente() {
    }
}
