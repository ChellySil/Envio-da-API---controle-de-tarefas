package com.example.demo.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@NoArgsConstructor
@Data
@Node("estudante")
public class Estudante {

    public Estudante(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Id
    @GeneratedValue
    private Long id;
    
    @NonNull
    @NotEmpty
    @Size(min = 2, max= 400)
    private String nome;

    @JsonIgnore
    @Relationship(type = "FAZ_UMA", direction = Direction.OUTGOING)
    private Set<Tarefa> tarefas = new HashSet<>();
}
