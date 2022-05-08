package com.example.JPAPractice.repository;

import com.example.JPAPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
