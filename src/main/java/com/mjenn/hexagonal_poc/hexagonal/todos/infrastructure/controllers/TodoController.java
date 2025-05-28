package com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.in.CreateTodoUseCase;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.in.ListTodosUseCase;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@AllArgsConstructor
@RestController
@RequestMapping("/api/hexagonal/todos")
public class TodoController {

    private final Logger logger = Logger.getLogger(TodoController.class.getName());

    private final ListTodosUseCase listTodosUseCase;

    private final CreateTodoUseCase createTodoUseCase;

    @PostMapping("")
    public ResponseEntity<String> postMethodName(@RequestBody @Valid Todo todo) {
        createTodoUseCase.createTodo(todo);
        
        logger.info("Received POST request with entity: " + todo);
        return ResponseEntity.ok("Received POST request with entity: " + todo);
    }
    

    @GetMapping("")
    public List<ProductDto> getAllTodos() {
        return listTodosUseCase.listTodos().stream()
        .map(todo -> new ProductDto(
            todo.getTitle(),
            todo.getDescription(),
            todo.isCompleted(),
            todo.getCreatedAt()
        )).toList();
    }
    
}
