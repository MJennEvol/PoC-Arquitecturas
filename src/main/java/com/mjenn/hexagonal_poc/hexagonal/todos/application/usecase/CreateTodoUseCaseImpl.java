package com.mjenn.hexagonal_poc.hexagonal.todos.application.usecase;

import org.springframework.stereotype.Component;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.in.CreateTodoUseCase;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.out.TodoRepositoryPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CreateTodoUseCaseImpl implements CreateTodoUseCase {

    private final TodoRepositoryPort todoRepository;    
    
    @Override
    public void createTodo(Todo todo) {
        if(todoRepository.listTodos().size() >= 10) {
            throw new IllegalStateException("Cannot create more than 10 todos");
        }
        todoRepository.createTodo(todo);
    }

}
