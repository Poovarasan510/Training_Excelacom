package org.example;

import org.example.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class ProductServiceTest {
	
	ProductService service=null;
	
	@BeforeEach
	void init()
	{   System.out.println("called");
		service=new ProductService();
	}
	
	@DisplayName(value="Text findDiscount method returns 0.20 or above for tv and laptops")
    @Test
   public void testFindDiscount()
    {
		double actual=service.findDiscount("tv");
		
		assertThat(actual,is(greaterThan(0.19)));
    }
	

	@DisplayName(value = "Test findProducts method returns a tv contains in the list")
	@Test
	void testFindProducts() {
	List<String> list=service.findProduct();
	
	assertThat(list, hasItem("tv"));
		
	}


	@DisplayName(value = "Test findProducts method returns a list of four brands")
	@Test
	void testFindProductsList() {
	List<String> list=service.findProduct();
	assertThat(list,hasItems("tv","laptop","phone","washing machine"));
	}

}
