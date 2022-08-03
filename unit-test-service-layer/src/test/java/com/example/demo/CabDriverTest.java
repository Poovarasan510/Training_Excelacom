package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.Matchers.hasSize;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverServices;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(Lifecycle.PER_CLASS)
public class CabDriverTest {
	
	@Autowired
	MockMvc mock;
//	
//	@Autowired
//	ObjectMapper mapper;
//	
	@MockBean
	CabDriverServices service;
	
	private CabDriver kanna;
	private CabDriver dama;
	private CabDriver david;
	
	@BeforeAll
	void init()
	{
		 kanna=new CabDriver(1011,"kanna",778,"chennai",LocalDate.of(2000, 10, 6),9.8);
		 dama=new CabDriver(1012,"Damu",7784,"chennai",LocalDate.of(2000, 10, 9),9.0);
		 david=new CabDriver(1013,"david",7778,"chennai",LocalDate.of(2000, 10, 5),8.8);

	}
	@DisplayName("Text find All Method return a array")

	@Test
	void testFindAll() throws Exception
	{
		
		List<CabDriver> list=new ArrayList<>();
		list.add(kanna);
		list.add(david);
		list.add(dama);
		
		given(service.findAll()).willReturn(list);
		
		mock.perform(MockMvcRequestBuilders
	            .get("/api/v1/drivers")
	           .contentType(MediaType.APPLICATION_JSON))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$", hasSize(3)))
	            .andExpect(jsonPath("$[1].driverName", is("david")));
		
	}
	
	@Test
	@DisplayName("Test Add Method")
	void testAdd() throws Exception{
		CabDriver sri=new CabDriver(1014,"Sri",778,"chennai",LocalDate.of(2000, 10, 6),9.8);
		given(service.save(sri)).willReturn(sri);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
	               .contentType(MediaType.APPLICATION_JSON)
	               .content(asJsonString(sri)))
	     		   .andExpect(status().isCreated())
	     		   .andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$.driverName", is("Sri")));
	}
	public static String asJsonString(CabDriver entity) {
		try {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(entity);
		} catch(Exception e) {
		throw new RuntimeException(e);
		}
		}
}

	
	


