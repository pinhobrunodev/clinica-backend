package com.pinhobrunodev.clinica.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
public class Medico extends Funcionario{

    @Column(columnDefinition = "TEXT")
    private String CRM;

    public Medico() {
    }


}
