package com.example.sahil.s.springboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.sahil.s.springboot.project.entity.Course;
import com.example.sahil.s.springboot.project.entity.Student;
import com.example.sahil.s.springboot.project.service.CourseService;
import com.example.sahil.s.springboot.project.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    // HOME
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Spring Boot is working!";
    }

    // ===== API (JSON) =====

    @PostMapping("/add")
    @ResponseBody
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    @ResponseBody
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    @ResponseBody
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("/courses")
    @ResponseBody
    public List<Course> getCourses() {
        return courseService.getAllCourses();
    }

    // ===== JSP =====

    @GetMapping("/addStudent")
    public String showForm() {
        return "addStudent";
    }

    @PostMapping("/saveStudent")
    public String saveStudentForm(Student student) {
        studentService.saveStudent(student);
        return "redirect:/studentsPage";
    }

    @GetMapping("/studentsPage")
    public String getStudentsPage(org.springframework.ui.Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "studentList";
    }

    @GetMapping("/editStudent/{id}")
    public String editStudent(@PathVariable Long id, org.springframework.ui.Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "updateStudent";
    }

    @PostMapping("/updateStudentForm")
    public String updateStudentForm(Student student) {
        studentService.updateStudent(student);
        return "redirect:/studentsPage";
    }
}