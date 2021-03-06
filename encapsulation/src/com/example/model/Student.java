package com.example.model;

public class Student {

private int rollNumber;
private String firstName; //camel casing//
private double markScored;
private String branch;

public Student() {
super();
// TODO Auto-generated constructor stub
}
public Student(int rollNumber, String firstName, double markScored, String branch) {
super();
if(markScored<0)
{
	throw new RuntimeException("mark scored should be positive4");
}
else
{
this.rollNumber = rollNumber;
this.firstName = firstName;
this.markScored = markScored;
this.branch = branch;
}
}
public Student(int rollNumber, String firstName, String branch) {
this(rollNumber,firstName,99,branch);
this.rollNumber = rollNumber;
this.firstName = firstName;
this.branch = branch;
}
public int getRollNumber() {
return rollNumber;
}
public String getBranch() {
return branch;
}
private void setBranch(String branch) {
this.branch = branch;
}
public void setRollNumber(int rollNumber) {
this.rollNumber = rollNumber;
}
public String getFirstName() {
return firstName;
}
void setFirstName(String firstName) {
this.firstName = firstName;
}
public double getMarkScored() {
return markScored;
}
public void setMarkScored(double markScored) {
	if(markScored<0)
	{
		throw new RuntimeException("mark should be positive integer");
	}
	else
	{
this.markScored = markScored;
}
}
}
	
