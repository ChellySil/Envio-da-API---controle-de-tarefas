package br.com.unisales.trabalhoRomulo.controllers;

import java.util.List;
import java.util.Optional;

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

import br.com.unisales.trabalhoRomulo.model.Consulta;
import br.com.unisales.trabalhoRomulo.repository.ConsultaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="Consultas")
public class ConsultaController {
	
	@Autowired
	ConsultaRepository ConsultaRepository;
	
	@ApiOperation(value="Lista de consultas")
	@GetMapping("/consultas")
	public List<Consulta> listaConsulta(){
			return ConsultaRepository.findAll();
		
	}
	
	@ApiOperation(value="Trás por ID")
	@GetMapping("/consulta/{id}")
	public Optional<Consulta> listaConsultaUnica(@PathVariable(value="id") Integer id){
		return ConsultaRepository.findById(id);
	}
	
	@ApiOperation(value="Deleta uma consulta")
	@DeleteMapping("/consulta")
	public void deletaConsulta(@RequestBody @Valid Consulta consulta) {
		ConsultaRepository.delete(consulta);
	}
	
	@ApiOperation(value="Atualiza uma consulta")
	@PutMapping("/consulta")
	public Consulta atualizaConsulta(@RequestBody @Valid Consulta consulta) {
		return ConsultaRepository.save(consulta);
	}
	 
	@ApiOperation(value="Salva uma consulta")
	@PostMapping("/consulta")
	public Consulta salvaConsulta(@RequestBody @Valid Consulta consulta) {
		return ConsultaRepository.save(consulta);
	}
}
