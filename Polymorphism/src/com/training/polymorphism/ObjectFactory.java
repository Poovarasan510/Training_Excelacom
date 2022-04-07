package com.training.polymorphism;

public class ObjectFactory {
	public Conditional getConditional(int key)
	{
	switch(key)
	{
	case 1:
		return new Professor("phd");
	case 2:
		return new Student(89);
   default:
	   return null;
	}
	}
	
	public double getValue(Conditional obj,Object value)
	{
		boolean result=obj.test(value);
		double travelallowance=1000;
		if(result)
			{
			travelallowance=2000;
			}

          return travelallowance;
	}

}