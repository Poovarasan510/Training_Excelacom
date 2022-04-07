
package com.training.services;

public class StudentService {
	
	private Student student;
	
	public StudentService(Student student) {
		super();
		this.student = student;
	}

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Applying the handle rule of exception handling
public String sendDetails() {
	
	String name=null;
	
	try
	{
		name=this.student.getFirstName();
	}
	 
	catch(NullPointerException e)
	{
		System.out.println("student object not passed check again");
		}
	return name;
}

//Applying declare rule of exception handling
public String findRank() throws NullPointerException
{
	String grade="A";
	
	if(this.student.getMarkScored()>90)
	{
		grade="O";
	}
	return grade;
}
	
}
	
	

