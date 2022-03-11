package com.example.shivali.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.shivali.entity.Student;
import com.example.shivali.repository.StudentRepository;
import com.example.shivali.service.StudentService;
@Service
public class StudentServiceimp implements StudentService{

	private StudentRepository stRepo;
	
	

	public StudentServiceimp(StudentRepository stRepo) {
		super();
		this.stRepo = stRepo;
	}



	@Override
	public List<Student> getAllStudent() {
		return stRepo.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return stRepo.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return stRepo.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return stRepo.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
     stRepo.deleteById(id);
		
	}







}
