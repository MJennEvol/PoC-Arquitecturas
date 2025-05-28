package com.mjenn.hexagonal_poc.hexagonal.todos.domain.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Todo {
    
    @NotBlank(message = "Title cannot be blank")
    private String title;
    
    private String description;
    
    private boolean completed;

    private LocalDateTime createdAt;

}
