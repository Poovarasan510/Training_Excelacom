package com.example.demo;

import com.example.demo.services.*;
import java.sql.*;
import java.util.Optional;
public class Application {

	public static void main(String[] args) {
		
		Connection con;
		
		try{
			
			con=
			DriverManager.getConnection("Jdbc:Oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			Product service=new Product(con);
		 
			
			ProductService toAdd=new ProductService(989,"ups",1789);
			//int rowAdded=service.addProduct(toAdd);
			//System.out.println("row added"+rowAdded);
			service.findAll().forEach(System.out::println);
			//service.deleteById(102);
			//service.findAll().forEach(System.out::println);
//			Optional<ProductService> found=service.findById(11);
//			if(found.isPresent())
//			{   System.out.println("++++++++++++++++++++++++++++");
//				System.out.println(found.get().toString());
//			}
//			else
//			{
//			System.out.println("value not found");	
//			}
			System.out.println("____________________________________________");
		int rowsupdated=service.updatePriceById(101,899);
		System.out.println("Rows updated"+rowsupdated);
		service.findAll().forEach(System.out::println);
		
//			System.out.println(con);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
