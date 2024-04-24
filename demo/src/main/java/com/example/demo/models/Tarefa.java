package com.example.demo.models;

//import org.hibernate.annotations.ManyToAny;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

// coisas do neo4j
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
@NoArgsConstructor
@Data
@Node("tarefas")
public class Tarefa {

    public Tarefa(Long id, String descricao){
     this.id = id;
     this.descricao = descricao;
    }


    public boolean possuiDependencias() {
        List<Tarefa> tarefasDependentes = tarefaRepository.findByDependenteId(getId());
        return !tarefasDependentes.isEmpty();
    }
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @NonNull
    @Size(min = 2, max= 400)
    private String descricao;
}
