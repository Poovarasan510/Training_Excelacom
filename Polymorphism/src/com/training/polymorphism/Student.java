package com.training.polymorphism;

public class Student implements Conditional{

	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int markScored;
	@Override
	public boolean test(Object value)
	{
		String strBranch=(String)value;
		
		boolean result=false;
		
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ece"))
		{
			result = true;
		
	}
	return result;
	}
	
	public int getMarkScored() {
		return markScored;
	}
	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}
	

	
	
}