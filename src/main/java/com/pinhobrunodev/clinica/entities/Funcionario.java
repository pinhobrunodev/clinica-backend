package com.pinhobrunodev.clinica.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String rg;
    private String orgaoEmissor;
    private String cpf;
    private String email;
    private String telefone;
    private String celular;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "tb_funcionario_usuario",
            joinColumns =
                    { @JoinColumn(name = "funcionario_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "usuario_id", referencedColumnName = "id") })
    private Usuario usuario;


    public Funcionario() {
    }


}
