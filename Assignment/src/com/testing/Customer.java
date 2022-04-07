package com.testing;

public class Customer {
private int custID;
private String name;
private int mobileNumber;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int custID, String name, int mobileNumber) {
	super();
	this.custID = custID;
	this.name = name;
	this.mobileNumber = mobileNumber;
}
public int getCustID() {
	return custID;
}
public void setCustID(int custID) {
	this.custID = custID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}


}
