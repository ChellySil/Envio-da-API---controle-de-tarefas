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

import br.com.unisales.trabalhoRomulo.model.Paciente;
import br.com.unisales.trabalhoRomulo.repository.PacienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="pacientes")
public class PacienteController {
	
	@Autowired
	PacienteRepository PacienteRepository;
	
	@ApiOperation(value="Lista de pacientes")
	@GetMapping("/pacientes")
	public List<Paciente> listaPaciente(){
			return PacienteRepository.findAll();
		
	}
	
	@ApiOperation(value="Trás por ID")
	@GetMapping("/paciente/{id}")
	public Optional<Paciente> listaPacienteUnico(@PathVariable(value="id") Integer id){
		return PacienteRepository.findById(id);
	}
	
	@ApiOperation(value="Deleta um paciente")
	@DeleteMapping("/paciente")
	public void deletaPaciente(@RequestBody @Valid Paciente paciente) {
		PacienteRepository.delete(paciente);
	}
	
	@ApiOperation(value="Atualiza um paciente")
	@PutMapping("/paciente")
	public Paciente atualizaPaciente(@RequestBody @Valid Paciente paciente) {
		return PacienteRepository.save(paciente);
	}
	 
	@ApiOperation(value="Salva um paciente")
	@PostMapping("/paciente")
	public Paciente salvaPaciente(@RequestBody @Valid Paciente paciente) {
		return PacienteRepository.save(paciente);
	}
}
