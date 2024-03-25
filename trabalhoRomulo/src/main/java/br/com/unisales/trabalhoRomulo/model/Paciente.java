package br.com.unisales.trabalhoRomulo.model;
import javax.persistence.spi.*;

import org.springframework.lang.NonNull;

import java.io.Serializable;

import jakarta.persistence.*;
@Entity
@Table(name = "Paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPaciente;
	@NonNull
	@Column(name = "nome", nullable = false, length=200)
	private String nome;
	
	@NonNull
	@Column(name = "idade", nullable = false, length=3)
	private String idade;
	
	@NonNull
	@Column(name="email", unique = true, nullable=false, length=100)
	private String email;
	
	@NonNull
	@Column(name="telefone", nullable = false, length=15 )
	private String telefone;
	@NonNull
	@Column(name = "dataNascimento", nullable = false, length = 15)
	private String dataNascimento;
	
	@Column(name = "cpf", unique = true, length = 15)
	private String cpf;
	
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
}
