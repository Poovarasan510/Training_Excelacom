package com.training.assignment;

public class Customer {
	
	private int customerId;
	private String customerName;
    private	double phoneNumber;
    private String email;
    

	public Customer(int customerId, String customerName, double phoneNumber, String email) {
		super();
		if(checkEmail(email))
		{
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
		else
		{
			try
			{
				throw new InvalidEmailException("inavlid expression");
				
			}
			
			catch(InvalidEmailException e)
			{
				e.printStackTrace();			}
		}
	}



	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public double getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}


	public Void setEmail(String mail) throws InvalidEmailException
	{
		if(checkEmail(mail))
			
		{ this.email=mail;
			
		}
		else
		{
			throw new InvalidEmailException("invalid expression");
		}
		return null;
	}
	 
	
	public boolean checkEmail(String mail)
	{
		if(mail.endsWith(".in") || mail.endsWith(".com") || mail.endsWith(".org"))
			 if(mail.contains("@"))
			 {
				 return true;
			 }
   return false;
	}
}