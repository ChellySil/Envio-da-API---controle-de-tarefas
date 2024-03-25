package br.com.unisales.trabalhoRomulo.controllers;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.*;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unisales.trabalhoRomulo.model.Tarefa;
import br.com.unisales.trabalhoRomulo.repository.TarefaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="Tarefa")
public class Tarefa {
	
	@Autowired
	PacienteRepository Tarefa;
	
	@ApiOperation(value="Lista de tarefas")
	@GetMapping("/tarefas")
	public List<Tarefa> listaTarefa(){
			return PacienteRepository.findAll();
		
	}
	
	@ApiOperation(value="Tarefas")
	@GetMapping("/Tarefas/{id}")
	public Optional<Tarefa> listaTarefaUnico(@PathVariable(value="id") Integer id){
		return TarefaRepository.findById(id);
	}
	
	@ApiOperation(value="Deleta uma tarefa")
	@DeleteMapping("/tarefa")
	public void deletaTarefa(@RequestBody @Valid Tarefa tarefa) {
		PacienteRepository.delete(tarefa);
	}
	
	@ApiOperation(value="Atualiza uma tarefa")
	@PutMapping("/tarefa")
	public Paciente atualizaTarefa(@RequestBody @Valid Tarefa tarefa) {
		return PacienteRepository.save(tarefa);
	}
	 
	@ApiOperation(value="Salva uma tarefa")
	@PostMapping("/paciente")
	public Paciente salvaTarefa(@RequestBody @Valid Tarefa tarefa) {
		return PacienteRepository.save(paciente);
	}
}
