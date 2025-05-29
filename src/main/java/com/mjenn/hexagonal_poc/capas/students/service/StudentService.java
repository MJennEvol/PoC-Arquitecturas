package com.mjenn.hexagonal_poc.capas.students.service;

import java.util.List;

import com.mjenn.hexagonal_poc.capas.students.entity.StudentDto;

public interface StudentService {

    List<StudentDto> getAllStudents();

}
