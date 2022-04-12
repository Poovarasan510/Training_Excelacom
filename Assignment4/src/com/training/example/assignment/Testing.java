package com.training.example.assignment;

import java.util.*;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Patient> patients=new HashSet<>();	
		
	Patient shyam=new Patient(101,"raj","chennai",9099);
	Patient surya=new Patient(191,"rajesh","thriruchi",9898);
	Patient prakash=new Patient(191,"syam","vellore",9878);
	
	
	patients.add(shyam);
	patients.add(surya);
	patients.add(prakash);
	
	Set<Doctor> set=new HashSet<>();
	Doctor sriHarish=new Doctor(211, "sriharish", "cardiology",patients);
	
	set.add(sriHarish);
	
	for(Doctor eachDoctor: set)
	{
	System.out.println(eachDoctor);

	}
	Map<Doctor, Set<Patient>> map1 = new HashMap<>();
	map1.put(sriHarish, patients);
	Appointment app = new Appointment(map1);
	System.out.println(app);
	
	
	}
}
