package com.example.shivali.service;

import java.util.List;

import com.example.shivali.entity.Student;

public interface StudentService {
	List<Student> getAllStudent();
	
	Student saveStudent(Student student);	
	
//	Student getByIdStudent(Long id);
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);

    void deleteStudentById(Long id);

	

	
	

}
