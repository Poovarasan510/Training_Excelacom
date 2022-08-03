package org.example.mock;

import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithMock {
	
	@DisplayName(value="Test add method with mock")
	@Test
	void testAddWithMock()
	{
		StudentServiceMock mock=new StudentServiceMock();
		
		StudentService service=new StudentService(mock);
		
		Student kavi=new Student(432,"Kavitha");
		
		Student pandi=new Student(435,"Pandiyan");

		service.add(kavi);
		
		service.add(pandi);
		
	    mock.verify(kavi,2);
	}

}
