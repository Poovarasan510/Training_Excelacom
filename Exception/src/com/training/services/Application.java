package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram=new Student(1010,"roman",98);
		
		StudentService service=new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		
		
		StudentService service2=new StudentService();
		
		try
		{
			System.out.println(service2.findRank());
		}
		catch(Exception e)
		
		{    
			System.err.println("name is not passed");
		}
		
		
		ExceptionHandling exHandling=new ExceptionHandling();
		exHandling.usingArrayIndexException(args);
		exHandling.usingNumberFormatException("fourty five");
	}

}
