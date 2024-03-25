package br.com.unisales.trabalhoRomulo.model;

import org.springframework.lang.NonNull;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "UsuarioRecepcionista")
public class UsuarioRecepcionista{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRecepcionista;
	@NonNull
	@Column(name = "RA", nullable = false, unique=true, length=20)
	private int RA;
	
	@NonNull
	@Column(name = "senha", nullable = false, length=15)
	private String senha;
	
	@NonNull
	@Column(name = "email", nullable = false, unique=true)
	private String email;
	
	@NonNull
	@Column(name = "confirmarSenha",nullable = false, unique=true)
	private String confirmarSenha;
	
	
	public int getIdRecepcionista() {
		return idRecepcionista;
	}
	public void setIdRecepcionista(int idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmarSenha() {
		return confirmarSenha;
	}
	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}
	
	
}
