package com.mjenn.hexagonal_poc.hexagonal.todos.application.usecase;

import java.util.List;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.in.ListTodosUseCase;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.out.TodoRepositoryPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ListTodosUseCaseImpl implements ListTodosUseCase {

    private final TodoRepositoryPort todoRepository;

    @Override
    public List<Todo> listTodos() {
        return todoRepository.listTodos();
    }

}
