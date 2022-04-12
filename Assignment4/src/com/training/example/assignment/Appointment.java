package com.training.example.assignment;

import java.util.*;
public class Appointment {
	
	public Appointment(Map<Doctor, Set<Patient>> list) {
		super();
		this.list = list;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
		this.list=new HashMap<>();
	}

	
	private Map<Doctor,Set<Patient>> list;

	public Map<Doctor, Set<Patient>> getList() {
		return list;
	}

	public void setList(Map<Doctor, Set<Patient>> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Appointment [list=" + list + "]";
	}
	
	


}
