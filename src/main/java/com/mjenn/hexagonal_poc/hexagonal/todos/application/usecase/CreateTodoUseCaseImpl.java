package com.mjenn.hexagonal_poc.hexagonal.todos.application.usecase;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.in.CreateTodoUseCase;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.out.TodoRepositoryPort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateTodoUseCaseImpl implements CreateTodoUseCase {

    private final TodoRepositoryPort todoRepository;    
    
    @Override
    public void createTodo(Todo todo) {
        todoRepository.createTodo(todo);
    }

}
