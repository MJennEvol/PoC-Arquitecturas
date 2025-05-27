package com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.repository;

import java.util.List;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.out.TodoRepositoryPort;
import com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.entities.TodoEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TodoRepositoryImpl implements TodoRepositoryPort{

    private final TodoJpaRepository todoJpaRepository;

    @Override
    public Todo createTodo(Todo todo) {
        //TodoEntity todoEntity = todoJpaRepository.save()
        throw new UnsupportedOperationException("Unimplemented method 'createTodo'");
    }

    @Override
    public List<Todo> listTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listTodos'");
    }
   

}
