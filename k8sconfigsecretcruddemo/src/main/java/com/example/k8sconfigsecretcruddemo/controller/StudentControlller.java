package com.example.k8sconfigsecretcruddemo.controller;


import com.example.k8sconfigsecretcruddemo.repo.Student;
import com.example.k8sconfigsecretcruddemo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControlller {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    @PostMapping("/add")
    public String  addStudent(@RequestBody Student student){
        repository.save(student);
        return "Student is registered successfully !";
    }



}