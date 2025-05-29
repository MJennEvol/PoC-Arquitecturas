package com.mjenn.hexagonal_poc.capas.students.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjenn.hexagonal_poc.capas.students.entity.StudentDto;
import com.mjenn.hexagonal_poc.capas.students.service.StudentService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@AllArgsConstructor
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
    
}
