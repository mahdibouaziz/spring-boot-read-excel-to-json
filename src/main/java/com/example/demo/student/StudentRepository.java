package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// to tell spring that this is a repo
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //it must extends JpaRepository<Model,Type of primary key>
}
