package com.hotel;
import java.util.*;
import com.employee.*;
import com.testing.*;

public class Implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer obj=new Customer(01,"Poovarasan",787777);
		System.out.println("Customer details");
   System.out.println("Customer Id"+obj.getCustID());
   System.out.println("Name of customer"+obj.getName());
   System.out.println("Customer Mobile Number"+obj.getMobileNumber());
   
   System.out.println("Employee details");
   Employee asd=new Employee(9,"Sriharish",989899);
   System.out.println("Employee id:"+asd.getEmpId());
   System.out.println("employee name:"+asd.getEmpName());
   System.out.println("employee number:"+asd.getEmpId());
   
   System.out.println("hotel details:");
   Hotel res=new Hotel("sarava",78,"veg");
   System.out.println("Hotel name;"+res.getHotelName());
   System.out.println("number of items:"+res.getItems());
   System.out.println("veg or non-veg:"+res.getVegNonveg());
   
  Scanner s=new Scanner(System.in);
  System.out.println("enter customer id***");
  int cusid=s.nextInt();
  obj.setCustID(cusid);  
  System.out.println("customer id"+obj.getCustID());
   
	}

}
