package com.example.sahil.s.springboot.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sahil.s.springboot.project.entity.Student;
import com.example.sahil.s.springboot.project.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // CREATE
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // READ
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // UPDATE
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    // GET BY ID (important for update)
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}