package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student sarra=  new Student("Sarra","sarra@gmail.com",22, LocalDate.of(1999,3,10));
            Student mahdi=  new Student("Mahdi","mahdi@gmail.com",21, LocalDate.of(2000,1,4));
            studentRepository.saveAll(List.of(sarra,mahdi));

        };
    }
}
