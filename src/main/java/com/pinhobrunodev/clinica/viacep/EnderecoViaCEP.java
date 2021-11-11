package com.pinhobrunodev.clinica.viacep;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoViaCEP {

    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public  EnderecoViaCEP(){

    }

}
