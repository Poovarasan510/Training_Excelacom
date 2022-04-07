 package com.training.polymorphism;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		// TODO Auto-generated method stub
		
		Conditional obj=super.getConditional(key);
		
		if(key==3)
		  obj=new Principal();
		else
		{			obj=super.getConditional(key);
		}
		return obj;
	}

	@Override
	public double getValue(Conditional obj, Object value) {
		// TODO Auto-generated method stub
		return super.getValue(obj, value);
	}
	

}
