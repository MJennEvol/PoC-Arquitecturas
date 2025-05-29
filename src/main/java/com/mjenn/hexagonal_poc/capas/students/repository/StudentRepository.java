package com.mjenn.hexagonal_poc.capas.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjenn.hexagonal_poc.capas.students.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
