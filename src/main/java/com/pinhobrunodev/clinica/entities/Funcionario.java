package com.pinhobrunodev.clinica.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pinhobrunodev.clinica.enums.AreaAtuacao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
    private AreaAtuacao areaAtuacao;
    private boolean isMedico;
    private String crm;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "tb_funcionario_usuario",
            joinColumns =
                    { @JoinColumn(name = "funcionario_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "usuario_id", referencedColumnName = "id") })
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name = "tb_funcionario_endereco"
            ,joinColumns = @JoinColumn(name = "funcionario_id")
            ,inverseJoinColumns = @JoinColumn(name = "endereco_id"))
    private Set<Endereco> enderecos = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "tb_medico_especialidade"
            ,joinColumns = @JoinColumn(name = "medico_id")
            ,inverseJoinColumns = @JoinColumn(name = "especialidade_id"))
    private Set<Especialidade> especialidades = new HashSet<>();


    public Funcionario() {
    }


}
