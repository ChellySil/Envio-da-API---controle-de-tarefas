package br.com.unisales.trabalhoRomulo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unisales.trabalhoRomulo.model.UsuarioRecepcionista;

public interface RecepcionistaRepository extends JpaRepository <UsuarioRecepcionista, Integer> {
	
	
	Optional<UsuarioRecepcionista> findById(Integer id);

}
