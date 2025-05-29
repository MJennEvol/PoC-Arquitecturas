package com.mjenn.hexagonal_poc.capas.students.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StudentDto {
    private final String name;
    private final String email;
    private final String lastName;
}
