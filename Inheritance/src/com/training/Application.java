package com.training;

import com.training.model.BankAccount;

public class Application {
	
	public static void main(String[] args)
	{
		BankAccount account=
				new BankAccount(1010,"ramesh",5000,"savings");
		System.out.println(account.toString());
		
	}

}