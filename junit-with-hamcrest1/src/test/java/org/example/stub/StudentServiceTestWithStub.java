package org.example.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithStub {
	
	@Test
	@DisplayName(value="Test Find Method with Stub to return all the elements added")
	void testFindAllMethod() {
		
		StudentRepositoryStub stub=new StudentRepositoryStub();
		
		StudentService service=new StudentService(stub);
		
		assertEquals(service.findAll().size(), 2);
		
	}

}
