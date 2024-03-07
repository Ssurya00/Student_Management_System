package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
