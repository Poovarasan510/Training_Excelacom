package com.example.training;


import java.util.*;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Product>list1= new HashSet<>();
		
		
		Product proObj=new Product(101,"Sriharish",4505);
		Product proObj1=new Product(102,"Raju",5550);
		Product proObj2=new Product(103,"Ram",6500);
		Product proObj3= new Product(104,"Yaruvv",7500);
		
		
		list1.add(proObj);
		list1.add(proObj1);
		list1.add(proObj2);
		list1.add(proObj3);

		for(Product itr:list1) {
			System.out.println(itr);
        
        
        	}
	}
}

