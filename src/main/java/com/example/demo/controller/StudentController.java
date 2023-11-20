package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequiredArgsConstructor
@RequestMapping("/student/")
public class StudentController {
    private final StudentService studentService;
    @GetMapping("allStudents")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok().body(studentService.getAllStudents());
    }
    @PostMapping("saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/student/saveStudent").toUriString());
        return ResponseEntity.created(uri).body(studentService.saveStudent(student));
    }
}
