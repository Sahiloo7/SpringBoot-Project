package com.example.sahil.s.springboot.project.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private String instructor;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}