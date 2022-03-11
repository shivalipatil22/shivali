package com.example.shivali.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shivali.entity.Student;

public interface StudentRepository extends JpaRepository<Student ,Long> {

}
