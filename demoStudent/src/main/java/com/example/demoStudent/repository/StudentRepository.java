package com.example.demoStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer> {


    @Query(value ="select * from student where email = :email", nativeQuery = true)
//    @Query(value ="select s from Student s where s.email = :email")
    Optional <Student> findByEmail(@Param(value = "email") String email);

}
