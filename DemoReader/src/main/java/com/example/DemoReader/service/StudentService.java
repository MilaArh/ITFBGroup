package com.example.DemoReader.service;
import com.example.DemoReader.model.Student;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"Ivan Ivanov", 19, "ivan@mail.ru"),
            new Student(2,"Peter Petrov", 21, "peter@mail.ru")));

    public List<Student> getStudents(){

        return students;
    }

    public Student getStudentById(int studId) {
        for (Student student : students){
            if (student.getStudId() == studId) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student stud){
        students.add(stud);
    }


    public int getIndex(int studId){
        int index = 0;
        for (int i=0; i < students.size(); i++){
            if(students.get(i).getStudId() == studId){
                index = i;
            }
        }
        return index;
    }

    public void updateStudent(int studId, Student stud) {
        students.set(getIndex(studId), stud);
    }

    public void deleteStudentById(int studId) {
        students.remove(getIndex(studId));
    }

}
