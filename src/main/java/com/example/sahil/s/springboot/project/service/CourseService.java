package com.example.sahil.s.springboot.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sahil.s.springboot.project.entity.Course;
import com.example.sahil.s.springboot.project.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<Course> getCoursesWithStudents() {
        return courseRepository.findCoursesWithStudents();
    }
}