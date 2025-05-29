package com.mjenn.hexagonal_poc.capas.students.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mjenn.hexagonal_poc.capas.students.entity.StudentDto;
import com.mjenn.hexagonal_poc.capas.students.repository.StudentRepository;
import com.mjenn.hexagonal_poc.capas.students.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(student -> new StudentDto(student.getName(), student.getEmail(), student.getLastName()))
                .toList();
    }

}
