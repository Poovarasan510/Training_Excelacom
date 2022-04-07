package com.training.example;

public class Address{
	

	public Address(int pincode, String district, String address1) {
		super();
		this.pincode = pincode;
		this.district = district;
		this.address1 = address1;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int pincode;
	private String district;
	private String address1;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	
	
	
}