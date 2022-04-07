package com.examples;


public class LifeInsurance extends Insurance{
	
	public LifeInsurance(int age) {
		super();
		this.age = age;
	}


	private int age;
	
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double calculatePremium()
	{
		
		double premium=10000;
		if(age<50)
		{
			premium=5000;
		}
		return premium;
	}
	
	

}
