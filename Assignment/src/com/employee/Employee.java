package com.employee;

public class Employee {
	private int empId;
	private String empName;
	private int telephone;
	public Employee(int empId, String empName, int telephone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.telephone = telephone;
	}
	public int getEmpId() {
		return empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	

}
