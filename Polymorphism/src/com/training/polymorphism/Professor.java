package com.training.polymorphism;

public class Professor implements Conditional {

	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String qualification;
	@Override
	public boolean test(Object value)
	{
		String strValue=(String)value;
		boolean result=false;
		if(strValue.equalsIgnoreCase("chennai"))
		{
		result=true;
	}
	        return result;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	

}
