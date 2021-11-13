package com.pinhobrunodev.clinica.repositories;

import com.pinhobrunodev.clinica.entities.Especialidade;
import com.pinhobrunodev.clinica.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
}