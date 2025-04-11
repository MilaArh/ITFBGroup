package com.example.demoStudent.repository;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studid")
    private int studId;
    private String name;
    private int age;
    private String email;

    public Student() {

    }

    public Student(int studId, String name, int age, String email) {
        this.studId = studId;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getStudId() {

        return studId;
    }

    public void setStudId(int studId){
        this.studId = studId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
