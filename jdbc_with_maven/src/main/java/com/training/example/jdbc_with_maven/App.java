package com.training.example.jdbc_with_maven;
import java.sql.Connection;

import com.example.demo.services.Product;
import com.example.util.ConnectionFactory;
import com.training.entity.ProductService;



/**
 * Hello world!
 *
 */
public class App 

{
	public static void member()
	{
		
	}
	public static void product()
	{
	Connection con=ConnectionFactory.getPostgressConnection();
		Product service=new Product(con);
		 
//		
		ProductService toAdd=new ProductService(07,"tree",1790);
		int rowAdded=service.addProduct(toAdd);
		System.out.println("row added"+rowAdded);
		service.findAll().forEach(System.out::println);
		
		
		
		

	}
    public static void main( String[] args )
    {
        
    	product();
//        Connection con;
   /*     try {
        	con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
        	
        	
        	MemberRepository service=new MemberRepository(con);
        //	System.out.println("++++++++++++++++++++++++++++++");
        	service.findAll().forEach(System.out::println);
        	
        	int rowsUpdated=service.updateByName("raj",898);
        	System.out.println("Rows updasted"+rowsUpdated);
        	service.findAll().forEach(System.out::println);
        	
        	System.out.println("Removing of ID");
        	service.remove(109);
        	service.findAll().forEach(System.out::println);
        	
        	Member obj=new Member(122,"ravi","vellore",LocalDate.of(22,8,22),"fiction",989,656);
        	int added=service.add(obj);
        	System.out.println("Rows added"+added);
        	service.findAll().forEach(System.out::println);
        
        
        }catch(SQLException e) {
        	e.printStackTrace();
        }*/
//        con=ConnectionFactory.getPostgressConnection();
//    	
//    	
//	       System.out.println(con);
    }
}
