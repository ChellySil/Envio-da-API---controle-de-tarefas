package br.com.unisales.trabalhoRomulo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unisales.trabalhoRomulo.model.Consulta;

public interface ConsultaRepository extends JpaRepository <Consulta, Integer> {
	
	Optional<Consulta> findById(Integer id);

}
