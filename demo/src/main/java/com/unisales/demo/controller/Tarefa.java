package com.unisales.demo.controller;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
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

import com.unisales.demo.controller.*;
import com.unisales.demo.repository.TarefaRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class Tarefa {
	
	@Autowired
	private TarefaRepository TarefaRepository;
	
	@GetMapping("/tarefas")
	public List<Tarefa> getTarefas(){
		return TarefaRepository.findAll();
	}
	
	@GetMapping("/Tarefas/{id}")
	public Optional<Tarefa> listaTarefaUnico(@PathVariable(value="id") Integer id){
		return (Optional<Tarefa>) TarefaRepository.findById(id);
								.orElseThrow((-> new RuntimeException("Tarefa não encontrada0")));
	}
	

@DeleteMapping("/tarefas/{id}")
 public ResponseEntity<Object> deleteTarefa(@PathVariable Long id) {
 if (TarefaRepository.existsById(id)) {
 TarefaRepository.deleteById(id);
 return ResponseEntity.ok("Tarefa excluída com sucesso");
 } else {
 return
ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tarefa não
encontrado com o ID: " + id);
 }
 }
	
	
	@PutMapping("/professores/{id}")
 public ResponseEntity<Object> updateTarefa(@PathVariable Long
id, @RequestBody Tarefa updatedTarefa) {
 Optional<Tarefa> TarefaOptional =
ProfessorTarefa.findById(id);
 if (professorTarefa.isPresent()) {
 Tarefa tarefas = TarefaOptional.get();
 tarefas.setNome(updatedTarefa.getNome());
 professor.setEmail(updatedTarefa.getEmail());
 tarefasRepository.save(tarefas);
 return ResponseEntity.ok(tarefas);
 } else {
 return
ResponseEntity.status(HttpStatus.NOT_FOUND).body("tarefa não
encontrado com o id: " + id);
 }

 }
	@ApiOperation(value="Salva uma tarefa")
	@PostMapping("/tarefa")
	public Tarefa salvaTarefa(@RequestBody @Valid Tarefa tarefa) {
		return TarefaRepository.save(tarefa);
	}
}