
package com.training.services;

import com.training.model.BankAccount;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService service=new BankAccountService();
		
		BankAccount ram=new BankAccount(1200,"Rames",5000);
		
		double simpleInterest=service.calculateInterest(ram);
		
		System.out.println("Simple interest"+simpleInterest);
		
	  BankAccount shyam=new BankAccount(1200,"shyam",2000);
		
		     simpleInterest=service.calculateInterest(shyam);
		
		System.out.println("Simple interest"+simpleInterest);

		//BankAccount[] accounts= new BankAccount[2];
		//accounts[0]=ram;
		//accounts[1]=shyam;
		
		//service.calculateInterest(accounts[0]);
		//service.calculateInterest(accounts[1]);
		
		BankAccount[] accounts= {ram,shyam};
		service.calculateInterest(accounts);
		
		double[] values=service.findInterest(accounts);
		for(double eachValue: values)
		{
			System.out.println(eachValue);
		}
		BankAccount[] accountList = {
				new BankAccount(800,"jay",5000,"savings"),
				new BankAccount(800,"kam",5000,"fixed"),
				new BankAccount(800,"tom",7000,"recurring"),
		};
		
		double[] interestvalues=service.findInterestByAccountType(accountList);
		for(double eachvalue: interestvalues)
			System.out.println("value"+eachvalue);
			 

	}

}
