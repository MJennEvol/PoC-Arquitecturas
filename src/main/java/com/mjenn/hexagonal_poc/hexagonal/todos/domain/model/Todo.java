package com.mjenn.hexagonal_poc.hexagonal.todos.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Todo {

    private String todoId;
    
    @NotNull
    @Min(1)
    private String title;
    
    private String description;
    
    private boolean completed;

    private LocalDateTime createdAt;

}
