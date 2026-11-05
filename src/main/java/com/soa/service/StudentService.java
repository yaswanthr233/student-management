package com.soa.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.soa.model.Student;
import com.soa.repo.StudentRepo;



@Service
public class StudentService {

    private final StudentRepo repository;

    public StudentService(StudentRepo repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

}
