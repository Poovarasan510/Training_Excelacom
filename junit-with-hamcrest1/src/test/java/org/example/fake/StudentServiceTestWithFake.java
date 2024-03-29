package org.example.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithFake {
	
	
	@Test
	@DisplayName(value="Test add method return inserted object back")
	void testAddMethod() {
		
		StudentRepoFake fake=new StudentRepoFake();
		
		StudentService service=new StudentService(fake);
		
		Student ram=new Student(101,"Ram");
		
		Student actual=service.add(ram);
		
		assertEquals(actual,ram);
	}

	
	@Test
	@DisplayName("Test FindAll method return all the element added")
	void testfindAll() {
		StudentRepoFake fake= new StudentRepoFake();
		StudentService service= new StudentService(fake);
		Student ram= new Student(101,"Ram");

		Student raja= new Student(102,"Raja");
		Student add1=service.add(ram);

		Student add2=service.add(raja);

		
		assertEquals(service.findAll().size(),2);

		
	}
}
