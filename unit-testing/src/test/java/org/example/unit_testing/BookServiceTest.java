package org.example.unit_testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.unittesting.Book;
import org.example.unittesting.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BookServiceTest {
	
	
BookService service= null;
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"called");
	}
	
	@BeforeEach
	public void setUp(TestInfo info) {
		service = new BookService();
		System.out.println(info.getDisplayName()+"called");
	}
	@Test
	@DisplayName(value="get method should not return null value")
	void testGetBookMethod()
	{
		BookService service=new BookService();
		
		Object actual=service.getBookList();
		
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName(value="get method should return 1 for success and 0 for failure")
	void testGetBookValue()
	{
		//Book getObj=new Book(101,"Harry Porter",899);
		
		BookService service=new BookService();
		
	  int actual=service.addBook(new Book());
	  
	  int expected=1;
	  
	  assertEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName(value="Add mehtod should not accept duplicate method")
	void testAddMethod()
	{
//		Book harry=new Book(101,"Harry Porter",899);
//		Book porter=new Book(102,"Harry Porter",500);
//
//
//		BookService service=new BookService();
//		
//		int value=service.addBook(harry);
//		int actual=service.addBook(porter);
//		
//		int expected=1;
//		
//		assertEquals(expected, actual);
		
  
		assertAll("Test add book", 
				()->assertEquals(1,service.addBook(new Book(101,"Harry Porter",899))),
				()->assertEquals(0, service.addBook(new Book(101,"Harry Porter",899)))
				);
	}
	
	@Test
	@DisplayName(value = "if the Element is not found in the collection removebook method should throw "
			+ "Runtime Exception with message Element Not Found")
	void testRemoveBook() {
		
		//BookService service = new BookService();
		
		Throwable exception = assertThrows(RuntimeException.class, 
				()-> service.removeBook(new Book(101, "Python", 500)));
		assertEquals("Element Not Found", exception.getMessage());
		
		
	}
	
@DisplayName(value="Test if getBestBook method has the value Head first java in one of first three positions")
	
@ParameterizedTest
@ValueSource(ints= {0,1,2})
void testGetBestBook(int pox)
{
	System.out.println(System.getProperty("os.name"));
	assumeTrue(System.getProperty("os.name").equals("windows 8"));
	assertEquals("Head First Java", service.getBestBooks().get(pox));
}
	}


