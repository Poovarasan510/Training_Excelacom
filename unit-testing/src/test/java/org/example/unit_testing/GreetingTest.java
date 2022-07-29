package org.example.unit_testing;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.example.unittesting.Greeting;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class GreetingTest {
	
	
	
	@Test
	@DisplayName(value="Test the get message return a string of length 8 characters")
	void testMaxLength()
	{
		Greeting grtobj= new Greeting();
		
		int actual=grtobj.getMessage().length();
		int expected=7;
		
		assertEquals(expected,actual);       
	}
	
	@Test
	@DisplayName(value="Test the birthday wish method does not return null")

	void testBirthDayWish()
	{
		Greeting grtObj=new Greeting();
		
		String actual=grtObj.birthdayWish("ramesh");
		
		assertNotNull(actual);
	}

@Test
@DisplayName("Text Birthday wish method should return happy birthday with user name suffixed")
void testBirthDayReturnValue()
{
		Greeting grtObj=new Greeting();
		
		String name="suresh";
		String actual=grtObj.birthdayWish(name);
		String expected="Happy Birthday"+name;
		assertEquals(expected, actual);
}


}
