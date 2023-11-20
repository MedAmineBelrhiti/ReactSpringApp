package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent (Student student);
    Optional<Student> getStudent(String firstName);
    List<Student> getAllStudents();
    Student updateStudent (Student student);
    void deleteStudent(Long id);
}
