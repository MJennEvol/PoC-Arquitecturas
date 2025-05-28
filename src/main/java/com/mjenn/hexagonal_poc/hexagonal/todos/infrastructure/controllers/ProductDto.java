package com.mjenn.hexagonal_poc.hexagonal.todos.infrastructure.controllers;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonSerialize
@Getter
@AllArgsConstructor
public class ProductDto {

    private String title;
    
    private String description;
    
    private boolean completed;

    private LocalDateTime createdAt;

}
