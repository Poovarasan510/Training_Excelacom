package com.training.model;

public class BankAccount {
	private int accountnumber;
	private String accountHoldername;
	private double balance;
	private String accountType;
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public BankAccount(int accountnumber, String accountHoldername, double balance, String accountType) {
		super();
		this.accountnumber = accountnumber;
		this.accountHoldername = accountHoldername;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountnumber, String accountHoldername, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.accountHoldername = accountHoldername;
		this.balance = balance;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
