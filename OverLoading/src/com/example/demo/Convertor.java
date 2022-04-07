package com.example.demo;

public class Convertor {
	
	public String convert(String str)
	
	{
		return str.toUpperCase();
	}
	
	//creating a overloaded method
	
	public double convert(double farenTemp)
	{
		return (farenTemp-32)*5/9;
	}
	 public double convert(double amt,int frm)
     {
		 double response=amt*100;
  	   if(frm>1)
  	   {
  		  double res=amt*120;
  	   }
  		   return response;
  	   
     }
	}

