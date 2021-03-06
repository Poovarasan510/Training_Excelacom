package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;
import org.training.model.Book;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@SpringBootApplication
@ComponentScan(basePackages= {"org.training.model","com.example"})
public class SpringQuickStartApplication {

	public static void trail()
	{ 
		ApplicationContext ctx=	null;
		System.out.println(ctx.getBean("ram"));
		
		System.out.println(ctx.getBean("teacher"));
		//when more than one bean of same type available
		//should use id and class name
		
	Teacher stella=ctx.getBean("harish",Teacher.class);

//		stella.setId(900);
//		stella.setName("stella sundari");
//		stella.setSubject("fluid mech");

		System.out.println(stella);
		
		//casting not required but there should be only one
		//bean of that type will throw exception
		Student shyam=ctx.getBean(Student.class);
		
		//when using id need to cast to specific bean since
		//return type of getBean method is object 
		
		Student ram=(Student) ctx.getBean("ram");
		
		//Object Harish=ctx.getBean("harish"); 
		//System.out.println(Harish);

	   
		}

	
	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringQuickStartApplication.class, args);
	
	System.out.println(ctx.getBean(Book.class));
	
	System.out.println("author:="+ctx.getBean(Author.class));
	
	Invoice inv=ctx.getBean(Invoice.class);
	
	System.out.println(inv);
	
	Bill bill=ctx.getBean(Bill.class);
	
	System.out.println("Customer:"+bill.getCustomer());
	System.out.println("Product:"+bill.getProduct());
	
CustomerList list=ctx.getBean(CustomerList.class);
list.getCutList().forEach(System.out::println);
	
	}
	
	@Bean
	public Author java()
	{
		return new Author(101,"harish kumar");
	}
	
	@Bean
	@Primary
	public Author mani()
	{
		return new Author(101,"Mani");
	}
}