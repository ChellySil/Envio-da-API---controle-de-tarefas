package com.example.demo.models;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tarefa")
public class Tarefa {

    public Tarefa(){

    }

    public Tarefa(Long id, String descricao){
     this.id = id;
     this.descricao = descricao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

   
    @Column(name = "descricao", length = 400)
    @NotEmpty
    @NotNull
    @Size(min = 2, max= 400)
    private String descricao;



    public String getDescricao() {
     return descricao;
    }
    

    public void setDescricao(String descricao) {
     this.descricao = descricao;
    }

    public Long getId() {
     return id;
    }

    public void setId(Long id) {
     this.id = id;
    }

}
