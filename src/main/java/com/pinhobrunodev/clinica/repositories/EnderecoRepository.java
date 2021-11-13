package com.pinhobrunodev.clinica.repositories;

import com.pinhobrunodev.clinica.entities.Convenio;
import com.pinhobrunodev.clinica.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
