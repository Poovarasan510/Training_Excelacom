package com.training.example;

public class Testing {

	public static void main(String[] args) {
		Address address=new Address(989, "chennai", "NSK");
		MobileBill sc=new MobileBill("poovarasan",987888,"prepaid",address);
		System.out.println("the amount:"+sc.findAmount());
		


	}

}
