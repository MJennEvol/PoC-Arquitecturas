package com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.out;

import java.util.List;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;

public interface TodoRepositoryPort {
    Todo createTodo(Todo todo);
    List<Todo> listTodos();
}
