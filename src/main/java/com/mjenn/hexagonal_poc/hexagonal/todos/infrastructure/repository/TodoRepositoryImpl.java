package com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;
import com.mjenn.hexagonal_poc.hexagonal.todos.domain.ports.out.TodoRepositoryPort;
import com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.entities.TodoEntity;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class TodoRepositoryImpl implements TodoRepositoryPort{

    private final TodoJpaRepository todoJpaRepository;

    @Override
    public Todo createTodo(Todo todo) {
        TodoEntity todoEntity = todoJpaRepository.save(TodoMapper.fromTodoToTodoEntity(todo));    
        return TodoMapper.fromTodoEntityToTodo(todoEntity);
    }

    @Override
    public List<Todo> listTodos() {
        List<TodoEntity> todoEntities = todoJpaRepository.findAll();
        return todoEntities.stream()
            .map(TodoMapper::fromTodoEntityToTodo)
            .toList();   
    }
   

}
