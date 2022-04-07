package com.training;

public class Applicationss 
{
	
	public static void main(String[] args)
	{
	
//	System.out.println(args[0]);
//	System.out.println(args[1]);
//	System.out.println(args[2]);
//	
//	int Value=Integer.parseInt(args[0]);
//	
//	System.out.println(++Value);
		
CurrencyConverter conv=new CurrencyConverter();
double dblamount=Double.parseDouble(args[0]);
System.out.println(conv.inrToUsd(dblamount));

Double inrvalue=Double.parseDouble(args[1]);
System.out.println(conv.inrtoeuro(inrvalue));

double salary=42400.0;

int intsal=(int)salary;

int age=42;
String strage=Integer.toString(age);
int intage=Integer.valueOf(strage);//converting to primitive type
	
	}

}
