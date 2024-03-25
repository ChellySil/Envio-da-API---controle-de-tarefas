package br.com.unisales.trabalhoRomulo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unisales.trabalhoRomulo.model.Tarefa;

public interface TarefaRepository extends JpaRepository <Tarefa, Integer> {
	
	Optional<Tarefa> findById(Integer id);

}
