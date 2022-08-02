package org.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;
import org.example.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	@Mock
	StudentRepository repo;
	
	@Mock
	StudentService serviceMock;
	
	@InjectMocks
	StudentService service;
	
	@Test
	@DisplayName("Test find all method with Mockito Stub")
	void testFindAll()
	{
		StudentRepository repo=mock(StudentRepository.class);
		
		StudentService service=new StudentService(repo);
		
		//Stubbing
		Student inv1 = new Student(901, "tom");
	     Student inv2=new Student(902, "jerry");

	    List<Student> list = new ArrayList<>();
	    
	    list.add(inv2);
	    list.add(inv1);

		when(repo.findAll()).thenReturn(list);
		
		assertEquals(service.findStudentSize(),2);
		
	}
	
	@Test
	@DisplayName("Test find all mehtod with mock annotation")
	void testFindAllWithMock()
	{
		Student inv1 = new Student(901, "tom");
	     Student inv2=new Student(902, "jerry");

	    List<Student> list = new ArrayList<>();
	    
	    list.add(inv2);
	    list.add(inv1);

		when(repo.findAll()).thenReturn(list);
		
		assertEquals(service.findStudentSize(),2);
		
		
	}
	
	@Test
	@DisplayName("Test addWithCondition Method of service it should add elements only"
			+"roll number is greater than 2000 else it should return a null value")

	void testAddWithCondition()
	{

		
		Student inv1 = new Student(78, "tom");
	    
        assertNotNull(service.addElement(inv1));
        
	  
	}
	
	@Test
	@DisplayName("Test verifyAddWithCondition method")
	void testVerifyAddWithCondition()
	{
		Student stud=new Student(2020,"ram");
		
		serviceMock.addElement(stud);
		
		verify(serviceMock,times(1)).addElement(stud);
	}
	
	@Test
	@DisplayName(value = "Test the value is not found should return ElementNotFound")
	void testElementFound() throws Exception {
		
		Student rev = new Student(101, "sriharish");
		Mockito.when(repo.findById(101)).thenReturn(Optional.of(rev));
		assertNotNull(service.findById(101));
		
		
	}
	
	@Test
	@DisplayName(value = "test the value delete the id if found otherwise throws exception")
   void testDeleteById() {
		Student rev = new Student(101, "sriharish");
		Mockito.when(repo.deleteById(101)).thenReturn(Optional.of(rev));
		assertNotNull(service.deleteById(101));
	}


}

