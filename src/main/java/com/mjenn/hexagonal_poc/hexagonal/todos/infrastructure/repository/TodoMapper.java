package com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.repository;

import com.mjenn.hexagonal_poc.hexagonal.todos.domain.model.Todo;
import com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.entities.TodoEntity;

public class TodoMapper {

    public static TodoEntity fromTodoToTodoEntity(Todo todo) {
        return new TodoEntity(
                todo.getTitle(),
                todo.getDescription(),
                todo.isCompleted(),
                todo.getCreatedAt()
        );
        }

    public static Todo fromTodoEntityToTodo(TodoEntity todoEntity) {
        return new Todo(
                todoEntity.getTitle(),
                todoEntity.getDescription(),
                todoEntity.isCompleted(),
                todoEntity.getCreatedAt()
        );
    }

}
