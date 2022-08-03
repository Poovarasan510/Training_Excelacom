package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverServices;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class UnitTestServiceLayerApplicationTests {
	
	@Autowired
	CabDriverServices service;
	
	@BeforeAll
	void setUp()
	{
		CabDriver driver=new CabDriver(101,"Jagan",778,"chennai",LocalDate.of(2000, 10, 6),9.8);
	   service.save(driver);
	}

	@Test
	@DisplayName("Find all method should return a empty array")
	void textFindAllFailure() {
		
		assertFalse(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("Find all method should return an array with element")
	void testFindAllSuccess()
	{
		assertFalse(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("Find By Id should return an Element with the given Id")
	void testFindById() {
		//assertEquals("Jagadeesh",service.findById(1010).get().getDriverName());

		CabDriver driver= service.findById(101).orElseThrow(EntityNotFoundException::new);
		assertEquals("Jagan",driver.getDriverName());
	}
}


