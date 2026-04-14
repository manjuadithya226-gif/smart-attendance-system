package com.example.attendance.controller;

import com.example.attendance.model.Student;
import com.example.attendance.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @PostMapping("/add")
    public Student add(@RequestBody Student s) {
        return repo.save(s);
    }

    @GetMapping("/all")
    public List<Student> getAll() {
        return repo.findAll();
    }
}
