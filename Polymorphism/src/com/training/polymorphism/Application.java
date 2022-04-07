package com.training.polymorphism;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ObjectFactory factory=new ObjectFactory();
Conditional object= factory.getConditional(1);
Conditional obj= factory.getConditional(2);
System.out.println(object.test("CHENNAI"));



System.out.println("Allowance"+factory.getValue(object,"chennai"));
System.out.println("Allowance"+factory.getValue(obj,"90"));
	}

}
