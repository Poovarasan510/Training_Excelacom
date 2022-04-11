package com.training.example;

import java.util.HashSet;
import java.util.Set;

public class TreeSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(101,"ram",78);
		Student shyam=new Student(102,"syam",68);
		Student magesh=new Student(103,"magesh",88);
		Student chinnamagesh=new Student(103,"magesh",88);

		Set<Student> set=new HashSet<>();
		set.add(chinnamagesh);
		set.add(magesh);
		set.add(shyam);
		set.add(ram);

	for(Student eachStudent:set)
	{
		System.out.println(eachStudent.getFirstName());
	}

	}

}
