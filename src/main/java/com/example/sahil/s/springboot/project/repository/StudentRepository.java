package com.example.sahil.s.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sahil.s.springboot.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}