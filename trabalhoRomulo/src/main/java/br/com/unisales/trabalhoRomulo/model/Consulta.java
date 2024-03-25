package br.com.unisales.trabalhoRomulo.model;

import org.springframework.lang.NonNull;
import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "Consulta")
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idConsulta;
	
	@NonNull
	@Column(name = "nome", nullable = false, length=200)
	private String nome;
	
	@NonNull
	@Column(name = "email", nullable = false, length=100)
	private String email;
	
	@NonNull
	@Column(name = "cpf",nullable = false, length=15)
	private String cpf;
	
	@NonNull
	@Column(name = "data", nullable = false, length=15)
	private String data;
	;
	@NonNull
	@Column(name = "hora", nullable = false, length=15)
	private String hora;
	
	@NonNull
	@Column(name = "especilidade", nullable = false, length=15)
	private String especialidade;
	
	@NonNull
	@Column(name = "telefone", nullable = false, length=15)
	private String telefone;
	
	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
