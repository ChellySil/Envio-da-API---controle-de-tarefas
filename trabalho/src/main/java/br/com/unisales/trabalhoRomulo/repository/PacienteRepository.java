package br.com.unisales.trabalhoRomulo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unisales.trabalhoRomulo.model.Paciente;

public interface PacienteRepository extends JpaRepository <Paciente, Integer> {
	
	Optional<Paciente> findById(Integer id);

}