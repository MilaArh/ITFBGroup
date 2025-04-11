package com.example.demoStudent.controller;

import com.example.demoStudent.repository.Student;
import com.example.demoStudent.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path ="api/students")
public class StudentController {

    private final StudentService studentService;

//    public  StudentController  () { //инициализируем зависимых объектов
//        this.studentService = new StudentService();
//    }

    public StudentController(StudentService studentService) {
         this.studentService = studentService;
    }


    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();

    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.create(student);
    }

    @DeleteMapping(path ="{id}")
    public void delete(@PathVariable(name = "id") int studId) {
        studentService.delete(studId);

    }

    @PutMapping(path ="{id}")
    public void update(@PathVariable(name = "id") int studId,
                       @RequestParam(required = false) String name,
                       @RequestParam(required = false)String email) {
        studentService.update(studId, name, email );

    }

}
