package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

import org.springframework.context.annotation.Bean;

@Configuration
public class AppConig {
	
	//Id of bean as same as method name
     @Bean
     public Student ram()
     {
    	 return new Student(101,"Ramesh",89);
     }
     
     @Bean
     public Teacher harish()
     {
    	 return new Teacher(232,"Harish","computer science");
     }
     
     @Bean
     public Product tv()
     {
    	 return new Product(101,"sony");
     }
     
     @Bean
     public Customer suresh()
     {
    	 return new Customer(202,"suresh");
     }
     
     @Bean
     public Customer ramesh()
     {
    	 return new Customer(202,"ramesh");
     }
}
