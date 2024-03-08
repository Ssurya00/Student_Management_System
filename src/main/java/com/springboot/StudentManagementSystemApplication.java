package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);

	}
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public void run(String... args) throws Exception {
		Student student1= new Student("suryakant", "singe", "surya@gmail.com");
		studentRepository.save(student1);
		
		Student student2= new Student("Nikhil", "Yakat", "niki@gmail.com");
		studentRepository.save(student2);
		
		Student student3= new Student("Abhishek", "puranik", "abhi@gmail.com");
		studentRepository.save(student3);
		
	}

}
