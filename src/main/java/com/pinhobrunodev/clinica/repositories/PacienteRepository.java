package com.pinhobrunodev.clinica.repositories;

import com.pinhobrunodev.clinica.entities.Paciente;
import com.pinhobrunodev.clinica.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}