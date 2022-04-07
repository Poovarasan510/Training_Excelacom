package com.training.polymorphism;

public class Principal implements Conditional
{
public Principal(String typeofcollege) {
		super();
		this.typeofcollege = typeofcollege;
	}
public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}
private String typeofcollege;

	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		boolean result=false;
		
		if(this.typeofcollege.equals("engg") && value.equals("rural"))
		{
			result=true;
		}
		return result;
	}
	public String getTypeofcollege() {
		return typeofcollege;
	}
	public void setTypeofcollege(String typeofcollege) {
		this.typeofcollege = typeofcollege;
	}
	
	

}
