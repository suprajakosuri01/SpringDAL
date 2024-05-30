package com.supraja.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.supraja.student.dal.Repos.StudentRepository;
import com.supraja.student.dal.entities.Student;



@SpringBootTest

class StudendalApplicationTests {
	
@Autowired
private	StudentRepository repo;
	@Test
	void testCreateStudent() {
		Student student=new Student();
		student.setName("sai");
		student.setCourse("lean");
		student.setFees(30.00);
		repo.save(student); 
		System.out.println("Saving student: " + student);
		
	}
	@Test
	void testFindById() {
		Student student=repo.findById(4l).get();
		System.out.println(student);
	
		
	}
	
	@Test
	void testUpdateByid() {
		Student student=repo.findById(5l).get();
		student.setFees(40.00);
		repo.save(student);
	
	}
@Test
	void testDeleteid() {
repo.deleteById(5l);
		
	}
}

