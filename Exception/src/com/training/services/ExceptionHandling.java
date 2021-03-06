package com.training.services;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args)
	{
		try {
			System.out.println(args[2]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("method requires three values to be passed a,b,c");
			e.printStackTrace();
		}
	}
		
		public void usingNumberFormatException(String value)
		{
			int age=0;
			try
			{
			   age=Integer.parseInt(value);
			
			}
			catch(NumberFormatException e)
			{
				System.out.println("string value cannot be wrapped");
			}
			System.out.println(age);
		}
			
			public String usingFinallyBlock()
			{
				int denominator=0;
				try
				{
					System.out.println(4/denominator);
				}
				catch(ArithmeticException e)
				{
					System.out.println("denominator should not be zero");
					return "welcome";
				}
				finally
				{
				System.out.println("Inside finally");
				
				}
				return "bye,bye";
		}
	}

