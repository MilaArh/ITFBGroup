package com.example.demoStudent.service;

import com.example.demoStudent.repository.Student;
import com.example.demoStudent.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public  Student create(Student student){
        Optional <Student> optionalStudent = studentRepository.findByEmail(student.getEmail());
        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("Студент с таким emal уже существует");

        }
        return studentRepository.save(student);
    }

    public void delete(int studId) {
        Optional <Student> optionalStudent = studentRepository.findById(studId);
        if (optionalStudent.isEmpty()) {
            throw new IllegalStateException("Студентa с id " + studId +  " не существует");

        }

        studentRepository.deleteById(studId);
    }
    @Transactional //если хотя бы на одном этапе ошибка, то изменения не будут внесены нигде studentRepository.save(student) можно не прописывать
    public void update(int studId, String name, String email) {
        Optional <Student> optionalStudent = studentRepository.findById(studId);
        if (optionalStudent.isEmpty()) {
            throw new IllegalStateException("Студентa с id " + studId +  " не существует");

        }
        Student student = optionalStudent.get();

        if (email != null && !email.equals(student.getEmail())){
            Optional <Student> foundByEmail = studentRepository.findByEmail(email);
            if (foundByEmail.isPresent()) {
                throw new IllegalStateException("Студент с таким emal уже существует");
            }
            student.setEmail(email);

        }

        if (name != null && !name.equals(student.getName())){
            student.setName(name);
        }

        studentRepository.save(student);


    }
}
