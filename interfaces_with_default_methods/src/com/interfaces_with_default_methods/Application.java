package com.interfaces_with_default_methods;

import interfaces_with_default_methods.Conditional;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentResultService service=new StudentResultService();
		System.out.println("is pass"+service.test(97.0));
		
        System.out.println("is fail:"+service.negate(90.00));
        
        System.out.println(Conditional.getMessage());
	}

}
