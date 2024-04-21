package com.example.demo.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.demo.models.Estudante;

public interface EstudanteRepository extends Neo4jRepository<Estudante, Long> {
    
}
