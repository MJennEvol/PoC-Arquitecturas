package com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.entities.TodoEntity;

@Repository
public interface TodoJpaRepository extends JpaRepository<TodoEntity, UUID>{

}
