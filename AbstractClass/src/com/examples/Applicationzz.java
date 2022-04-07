package com.examples;

public class Applicationzz {
	
	public static void printPremium(Insurance object)
	{
		System.out.println("premium:"+object.calculatePremium());
	}
	
	public static void printPremium(LifeInsurance obj)
	{
		System.out.println("premium of lifeinsurance"+obj.calculatePremium());
	}
	public static void main(String[] args) {
		
//		VehicleInsurance car=new VehicleInsurance(1010,"ramesh",400,"car",2019);	
//	    printPremium(car);
//		
		LifeInsurance lic=new LifeInsurance(5);
		printPremium(lic);
		
		String[] illness= {"bp","Sugar","tyroid"};
		HealthInsurance health= new HealthInsurance(3033,"Viky",5000,illness);
		printPremium(health);
	}
	

}
