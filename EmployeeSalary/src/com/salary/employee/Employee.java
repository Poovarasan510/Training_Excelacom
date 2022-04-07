package com.salary.employee;

public class Employee {
	private int salary;
	private double bonus;

	public double calculateBonus(int salary)
	{
		bonus=salary*0.33;
		return bonus;
	}
	
}
