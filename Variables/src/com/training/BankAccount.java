package com.training;

public class BankAccount {
	//static variable
private static int count;
//instance variable
private String accountHolderName;
private double balance;
private int accountNumber;
//static method


public static int getCount()
{
	return ++count;
}

public String getAccountHolderName() {
	return accountHolderName;
}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public static void setCount(int count) {
	BankAccount.count = count;
}

public BankAccount(String accountHolderName, double balance) {
	super();
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.accountNumber=getCount();
}

//instance method
public double getUpdatedBalance(double amount)//parameter variable
//local variable
{
	double updatedBalance;  //local variable must be initialized before using
	//System.out.println(updatedBalance);
	double currentBalance=0;
	this.balance=this.balance+amount;
	return this.balance;
}

public int getAccountNumber() {
	// TODO Auto-generated method stub
	return accountNumber;
}
}
