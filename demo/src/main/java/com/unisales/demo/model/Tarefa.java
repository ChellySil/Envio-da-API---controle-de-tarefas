package com.unisales.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.lang.NonNull;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "Tarefa")
public class Tarefa{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTarefa;
	@NonNull
	@Column(name = "titulo", nullable = false, unique=true, length=20)
	private int titulo;
	
	@NonNull
	@Column(name = "descricao", nullable = false, length=15)
	private String descricao;
	
	@NonNull
	@Column(name = "completo", nullable = false, unique=true)
	private String completo;


	
	public int getIdtarefa() {
		return idTarefa;
	}
	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String senha) {
		this.descricao = descricao;
	}
	public String getCompleto() {
		return completo;
	}
	public void setCompleto(String completo) {
		this.completo = completo;
	}

}