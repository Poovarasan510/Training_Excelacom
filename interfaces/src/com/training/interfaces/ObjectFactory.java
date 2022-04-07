package com.training.interfaces;

public class ObjectFactory {
	
	public Automobile getObject(int key)
	{
		switch(key)
		{
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotaCar();
		default:
			return null;
			
		}
	}

	public void printQuote(Automobile poly)
	{
		if(poly!=null)
		{
		System.out.println("Colour:"+poly.getColor());
		System.out.println("model:"+poly.getModel());
		System.out.println("price"+poly.getPrice());
	}
		else
		{
			System.out.println(" invalid choice ");
		}
	

}
}
