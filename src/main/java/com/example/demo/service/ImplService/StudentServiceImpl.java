package com.example.demo.service.ImplService;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Optional<Student> getStudent(String firstName) {
        return repository.findByFirstName(firstName);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
