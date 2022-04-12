package com.training.example;

import java.util.HashMap;
import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram=new Student(101,"pooov",78);
		Student shyam=new Student(102,"syam",68);
		Student mukes=new Student(103,"",68);
		
		HashMap<Integer,Student> map =new  HashMap<>();
		map.put(900, ram);
		map.put(902, shyam);
		map.put(903, mukes);	
		
	System.out.println(map.get(900));
	Set<Integer> keys=map.keySet();
	System.out.println("when you want only key");
	for(Integer key:keys)
	{
		System.out.println(key);
	}
	
	Collection<Student> list=map.values();
	
	System.out.println("when you want only value");
	for(Student eachStudent:list)
	{
		System.out.println(eachStudent);
	}
	
	Set<Map.Entry<Integer, Student>> list2=map.entrySet();
	
	System.out.println("when you want both key and value");
	for(Map.Entry<Integer, Student> eachEntry:list2)
	{
		System.out.println(eachEntry.getKey());
		System.out.println(eachEntry.getValue());
	}
	}

}
