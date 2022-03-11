package com.example.shivali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.shivali.repository.StudentRepository;

@SpringBootApplication
public class ShivaliApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ShivaliApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student(0, "Shivali","Patil","shivali98@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student(0, "Minakshi","Nadale","nadale2434@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student(0, "Prajkta","Powar","uttujh@gmail.com");
//		studentRepository.save(student3);
		
	}

}
