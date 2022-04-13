package com.example.training;


import java.util.*;

public class ProductService {
	
	private Set<Product>set;
	
	
	
	
	
	public ProductService(Set<Product> set) {
		super();
		this.set = set;
	}




	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Set<Product> getTopThree() {
		
		Set<Product>modifiedSet= new TreeSet<>();
		
	
		Iterator<Product> itr=set.iterator();  
		int i=1;
		
        while(itr.hasNext())  
        {  
        modifiedSet.add(itr.next());
        i++;
        if(i>3) {
        	break;
        }
				
        }

		return modifiedSet;
	}

}
