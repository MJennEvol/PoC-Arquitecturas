package com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.in;

import java.util.List;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;

public interface ListTodosUseCase {
    List<Todo> listTodos();
}
