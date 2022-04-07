package com.example.demo;

import java.util.*;

public class Example {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter name");
       String name=sc.next();
       
       System.out.println("enter the farenheit temp");
       double farenTemp=sc.nextDouble();
       
       System.out.println("enter amt");
       double amt=sc.nextDouble();
       
       System.out.println("enter frm");
       int frm=sc.nextInt();
       Convertor convobj=new Convertor();
       System.out.println(convobj.convert(name));
       System.out.println(convobj.convert(farenTemp));
       System.out.println(convobj.convert(amt,frm));
       
 
   
       sc.close();
	}

}
