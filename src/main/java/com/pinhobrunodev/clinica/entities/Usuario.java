package com.pinhobrunodev.clinica.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class Usuario extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
    private String apelido;

    @ManyToMany
    @JoinTable(name = "tb_usuario_cargo"
            ,joinColumns = @JoinColumn(name = "usuario_id")
            ,inverseJoinColumns = @JoinColumn(name = "cargo_id"))
    private Set<Cargo> cargos = new HashSet<>();

    public Usuario() {
    }

}
