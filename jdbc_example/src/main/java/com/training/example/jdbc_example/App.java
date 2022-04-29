package com.training.example.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.training.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void loadResult()
	{
		 Connection Con;
		Con=ConnectionFactory.getOracleConnection();
		
			
 	CustomerService service=new CustomerService(Con);
 	
 service.findByAll().forEach(System.out::println);
	  	
	  	Optional<LoanApplication> customer=service.findById(101);
	  	System.out.println(customer);
 	
    Customer obj1=new Customer(391,"ramu",8999,350);
    LoanApplication loan=new LoanApplication(401,obj1,679);
    
   int added=service.add(loan);
  	//service.findByAll().forEach(System.out::println);
   System.out.println("Row added"+added);
	}
    public static void main( String[] args )
    { 
             loadResult();
    
}
}
