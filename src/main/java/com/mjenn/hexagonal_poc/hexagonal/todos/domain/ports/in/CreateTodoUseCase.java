package com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.in;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;

public interface CreateTodoUseCase {
    void createTodo(Todo todoRequest);
}
