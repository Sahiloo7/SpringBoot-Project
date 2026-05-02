package com.example.sahil.s.springboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sahil.s.springboot.project.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // INNER JOIN query (IMPORTANT for assignment)
    @Query("SELECT c FROM Course c INNER JOIN c.student s")
    List<Course> findCoursesWithStudents();

    @Query("SELECT c FROM Course c INNER JOIN c.student s")
    List<Course> getCoursesWithStudents();
}
