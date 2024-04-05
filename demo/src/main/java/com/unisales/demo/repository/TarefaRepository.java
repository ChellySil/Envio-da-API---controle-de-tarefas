package com.unisales.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisales.demo.model.*;
import com.unisales.demo.repository.*;

public interface TarefaRepository extends JpaRepository <Tarefa, Long> {
	
	Optional<com.unisales.demo.controller.Tarefa> findById(Integer id);

}