package com.interfaces_with_default_methods;


import interfaces_with_default_methods.AgeCondition;
import interfaces_with_default_methods.Conditional;

public class StudentResultService implements Conditional<Double>,AgeCondition<Double>{

	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t>80;
	}

	@Override
	public boolean negate(Double value) {
		// TODO Auto-generated method stub
		
		//completely overriding super type with custom code
		if(value>100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
//		boolean res1= Conditional.super.negate(value);
//		boolean res2=AgeCondition.super.negate(value);
//		
//		if(res1 && res2)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}


