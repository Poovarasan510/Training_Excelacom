package com.training;

public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount("ramesh",1000);
		System.out.println("current balance"+account.getUpdatedBalance(2000));
		System.out.println("account number"+account.getAccountNumber());
	//	System.out.println(BankAccount.getCount());
	//  System.out.println(BankAccount.getCount());
		BankAccount account2=new BankAccount("suresh",2000);
		System.out.println("current Balance"+account2.getUpdatedBalance(2000));
		System.out.println("Account Number"+ account2.getAccountNumber());


	}

}
