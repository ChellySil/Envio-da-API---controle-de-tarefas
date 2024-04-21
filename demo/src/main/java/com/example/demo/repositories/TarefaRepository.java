package com.example.demo.repositories;

//import org.springframework.data.jpa.repository.support.JpaEntityInformation;
//import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import com.example.demo.models.*;
import java.util.List;


//import jakarta.persistence.EntityManager;

//TaskRepository.java - Repository
//import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends Neo4jRepository<Tarefa, Long> {
    //  comandos CQL do neo4J
    //1º    Busca o id da tarefa
    //2º    Lista os Nós
    //3º    Lista os estudantes que fazem uma tarefa
    @Query("MATCH (t:Tarefa) WHERE ElementId(t) = :#{#id} RETURN f")
    Tarefa findOneById(Long id);

    @Query("MATCH (t:Tarefa) RETURN f;")
    List<Tarefa> findTarefa();

    @Query("MATCH (t:Tarefa)\n" +//
    "RETURN count(t)")
    Long getTotalTarefas();
}
