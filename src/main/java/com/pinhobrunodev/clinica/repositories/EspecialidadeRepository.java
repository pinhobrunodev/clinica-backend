package com.pinhobrunodev.clinica.repositories;

import com.pinhobrunodev.clinica.entities.Especialidade;
import com.pinhobrunodev.clinica.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadeRepository extends JpaRepository<Especialidade,Long> {
}