package com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.entities.TodoEntity;

public interface TodoJpaRepository extends JpaRepository<TodoEntity, Long>{

}
