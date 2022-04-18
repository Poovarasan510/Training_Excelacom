package com.interfaces_with_default_methods;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentResultService service=new StudentResultService();
		System.out.println("is pass"+service.test(97.0));
		
        System.out.println("is fail:"+service.negate(90.00));
	}

}
