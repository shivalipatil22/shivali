package com.example.shivali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.shivali.entity.Student;
import com.example.shivali.service.StudentService;

@Controller
public class StudentController {

	private StudentService stuService;

	public StudentController(StudentService stuService) {
		super();
		this.stuService = stuService;
	}
	
	
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", stuService.getAllStudent());
		return "students";
      }
	
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		//create student object to hold student from data
		Student student= new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		stuService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", stuService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student, Model model) {
		
		//get student database from id
		Student existingStudent= stuService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save updated student object
		stuService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	//handler method to delete student request
	@GetMapping("students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		stuService.deleteStudentById(id);
		return "redirect:/students";
	
	}
}
