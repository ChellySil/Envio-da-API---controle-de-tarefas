package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Estudante;
import com.example.demo.models.Tarefa;
import com.example.demo.repositories.EstudanteRepository;
import com.example.demo.repositories.TarefaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/estudante")
@AllArgsConstructor
public class EstudanteController {
    @Autowired
    private EstudanteRepository estudanteRepository;
    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public List<Estudante> getEstudantes() {
        return estudanteRepository.findAll(Sort.by("nome"));
    }
    @GetMapping("/{id}")
    public Estudante getEstudante(@PathVariable(name = "id", required = true) Long id) {
        Optional<Estudante> umestudante = estudanteRepository.findById(id);
        Estudante estudante = null;
        if (umestudante.isPresent()) {
            estudante = umestudante.get();
            return estudante;
        }
        return estudante;
    }
    @GetMapping("/tarefas/{id}")
    public Set<Tarefa> getTarefas(@PathVariable(name = "id", required = true) Long id){
        Optional<Estudante> umestudante = estudanteRepository.findById(id);
        if (umestudante.isPresent()){
            return umestudante.get().getTarefas();
        }
        return null;
    }
    @PostMapping
    public Estudante saveEstudante(@RequestBody Estudante estudante){
        return estudanteRepository.save(estudante);
    }
    @PostMapping("/{id}/fazuma/{idTarefa}")
    public Estudante fazuma(@PathVariable(name = "id", required = true) Long id, @PathVariable (name = "idTarefa", required = true) Long idTarefa){
        Estudante estudante = estudanteRepository.findById(id).get();
        Tarefa tarefa = tarefaRepository.findById(idTarefa).get();
        if (estudante != null && tarefa != null) {
            estudante.getTarefas().add(tarefa);
        }
        return estudanteRepository.save(estudante);
    }
    @PutMapping
    public Estudante updEstudante(@RequestBody Estudante estudante){
        return estudanteRepository.save(estudante);
    }
    @DeleteMapping("/{id}")
    public Estudante deletarEstudante (@PathVariable(name = "id", required = true) Long id) {
        Estudante estudante = estudanteRepository.findById(id).get();
        if (estudante != null) {
            estudanteRepository.delete(estudante);
        }
        return estudante;
    }
}
