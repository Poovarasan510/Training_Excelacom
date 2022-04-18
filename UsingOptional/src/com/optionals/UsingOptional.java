package com.optionals;

import java.util.Optional;

public class UsingOptional {
	
	public static Optional<String> getValue(int key)
	{
		Optional<String> response=Optional.empty();
		if(key==1)
		{
			response=Optional.of("hi");
		}
			return response;
	}
	public static Object getString(int key)
	{
		switch(key)
		{
			case 1:
				return new String("chocobar");
				
			case 2:
				return new StringBuffer("cassatta");
			default:
				return null;
		}
		
	}
	
	public static void main(String[] args)
	{
		// will throw null pointer exception when u try to print 3
		//System.out.println(getString(3).toString());
//	}
	
	//to avoid nullpointer exception and return a default value
	//new feature java 8 is optional
	
	Optional<Object> optional=Optional.ofNullable(getString(2));
        System.out.println(optional.orElse("vannila").toString());
        
        //here will check if value is present 
        //it it is present then only we will call get method
        
        Optional<Object> opt2=Optional.ofNullable(getString(2));
     if(opt2.isPresent())   

	{
		System.out.println("value is present"+opt2.get());
	}
	else
	{
		System.out.println("value is not present");
	}
     
     //using lambda expression with optional
     
//     Optional<Object> opt3=Optional.ofNullable(getString(3));
//      opt3.orElseThrow(()->new RuntimeException("no object for value 3 try again"));
//      
      //call the getvalue method by passing 1 as arguement
      //call the samemethod again by passing 2 as arguement
      //print the results
      
      Optional<String> resp=getValue(2);
      if(resp.isPresent()) 
      {
    	  System.out.println(resp.get().toString());
      }
      else
      {
    	  System.out.println("invalid choice enter 1");
      }
}
}