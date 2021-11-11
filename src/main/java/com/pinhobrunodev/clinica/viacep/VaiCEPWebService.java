package com.pinhobrunodev.clinica.viacep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class VaiCEPWebService {
    @Autowired
    private RestTemplate restTemplate;
    private String baseUrl = "http://viacep.com.br/ws";
    private String type = "/json";

    public EnderecoViaCEP viaCEPWebService(Integer cep) throws Exception {
            Map<String, String> uriVariables = new HashMap<>();

            uriVariables.put("cep", cep.toString());
            System.out.println(baseUrl + "/" + cep + type);
            ResponseEntity<EnderecoViaCEP> result = restTemplate.getForEntity(baseUrl + "/{cep}" + type, EnderecoViaCEP.class,
                    uriVariables);
            return result.getBody();
    }
}
