package com.training.interfaces;

public class Application01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectFactory ds=new ObjectFactory();
		Automobile ob=ds.getObject(1);
		Automobile obj=ds.getObject(3);
		ds.printQuote(ob);
		ds.printQuote(obj);
		System.out.println("company name:"+ob.COMPANY);
		
		

	}

}
