package com.soa.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.soa.model.Student;
import com.soa.service.StudentService;



@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}