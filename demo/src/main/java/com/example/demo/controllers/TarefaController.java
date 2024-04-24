package com.example.demo.controllers;

import java.util.List;
//import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Tarefa;
import com.example.demo.repositories.TarefaRepository;
//import com.example.demo.repositories.erros.TaskNotFoundException;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/tarefas")
@AllArgsConstructor
public class TarefaController {
	
@Autowired
private TarefaRepository tarefa;
	
	@GetMapping
	public List<Tarefa> getTodasTarefas(){
		return tarefa.findAll();
	}
	
	@PostMapping
	public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
	return this.tarefa.save(tarefa);
}
	@GetMapping("/{id}")
    public Tarefa getTaskById(@PathVariable Long id) {
        return tarefa.findById(id).orElseThrow();
    }
	
	@PutMapping("/{id}")
	public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaDetalhes) {
		Tarefa tarefa = this.tarefa.findById(id).orElseThrow(null);
		tarefa.setDescricao(tarefaDetalhes.getDescricao());
		return this.tarefa.save(tarefa);
	}

	@DeleteMapping("/{id}")
public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
    Tarefa tarefa = tarefaRepository.findById(id).orElseThrow(() -> new TarefaNotFoundException(id));

    tarefa.setAtivo(false); 
    tarefaRepository.save(tarefa);

    return ResponseEntity.noContent().build();
}
	
	
}
