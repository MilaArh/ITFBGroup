package com.example.DemoReader.controller;

import com.example.DemoReader.model.Student;
import com.example.DemoReader.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/students/{studId}")
    public Student getStudentById(@PathVariable int studId){
        return service.getStudentById(studId);
    }


    @PostMapping("/students")
    public void addStudent(@RequestBody Student stud){
        service.addStudent(stud);
    }

    @PutMapping("/students/{studId}")
    public void updateStudent(@PathVariable int studId, @RequestBody Student stud){
        service.updateStudent(studId, stud);
    }

    @DeleteMapping("/students/{studId}")
    public void deleteStudentById(@PathVariable int studId){
        service.deleteStudentById(studId);
    }
}
