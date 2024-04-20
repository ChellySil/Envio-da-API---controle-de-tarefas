package com.example.demo.repositories.erros;

//TaskNotFoundException.java
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TaskNotFoundException extends RuntimeException {
 public TaskNotFoundException(Long id) {
     super("Task not found with id: " + id);
 }
}
