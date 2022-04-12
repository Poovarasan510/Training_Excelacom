package com.training.example;
import java.util.*;
public class HashMapApplication {
	
	public static void main(String args[])
	{
		Student ram=new Student(101,"pooov",78);
		Student shyam=new Student(102,"syam",68);
		Student mukes=new Student(103,"",68);
		
		HashMap<Integer,Student> map =new  HashMap<>();
		
	System.out.println(map.put(900, ram));
	System.out.println(map.put(902, shyam));
	Student added=map.put(902, mukes);
	
	if(added!=null)
	{
		map.put(904, added);
	}
	
	System.out.println(map.get(902));
	System.out.println(map.get(904));
	}

}
