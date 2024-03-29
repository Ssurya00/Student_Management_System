package com.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;
import com.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	//if we have only one constructor then we can avoid writing @Autowired	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
