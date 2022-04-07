package com.training.interfaces;

public class Applicationz {

	public static void main(String[] args)
	{
		
		//subtype = new subtype
		//CurrencyConverter conv=new CurrencyConverter();
		
		Function conv=new CurrencyConverter();
		
		double response=conv.apply(200);
		
		System.out.println(conv.counter);
		System.out.println(response);
		
		System.out.println(conv.apply(100));
		
//		CheckCondition sc=new CurrencyConverter();
//		
//		System.out.println(sc.test(100));
		
		if(conv instanceof CheckCondition)
		{
			CheckCondition obj=(CheckCondition)conv;
			System.out.println("is discount allowed:"+obj.test(10000));
	
		}
	
	Conditional condobj=new DiscountConverter();
	System.out.println(condobj.test(5000));
	System.out.println(condobj.negate(600));
	
	}
	
	
	
}
