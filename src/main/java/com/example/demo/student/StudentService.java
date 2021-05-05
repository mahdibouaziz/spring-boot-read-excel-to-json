package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

// Tell spring boot that our class is an injectable service
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
       // return List.of(
         //       new Student(1L,"Sarra","sarra@gmail.com",22, LocalDate.of(1999,3,10))
       // );

        return studentRepository.findAll();
    }
}
