package com.training;

import com.training.model.*;
import com.training.services.*;
import java.util.*;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccountService service=new BankAccountService();
BankAccount[] list=new BankAccount[3];
int idx=0;
int choice=0;
Scanner sc = new Scanner(System.in);
do {	
	
	System.out.println("account number");
	int accountNumber=sc.nextInt();
   System.out.println("account holder name");
	String accountHolderName=sc.next();
	
	System.out.println("balance");
	double balance=sc.nextDouble();
	
	System.out.println("account type");
	String accountType=sc.next();
	
	
	BankAccount account=new BankAccount(accountNumber,accountHolderName,balance,accountType);
			list[idx]=account;
	System.out.println("enter o to end 1 to continue");
	choice=sc.nextInt();
	idx++;
  }while(choice!=0);

double[] values=service.findInterestByAccountType(list);
for(double eachValue : values)
{
	System.out.println(eachValue);
}
sc.close();
	}

}
