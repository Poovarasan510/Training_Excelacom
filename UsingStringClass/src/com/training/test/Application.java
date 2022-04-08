package com.training.test;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   StringService service=new StringService();
   System.out.println("Enter key");
   int key=sc.nextInt();
   
   
      switch(key)
   {
	   case 1:
		   service.stringEquals("ram", "ram");
		   break;
		   
	   case 2:
		   service.stringObjectEquals();
		   break;
		   
	   case 3:
		   service.usingTrim(" flower king");
		   break;
		   
	   case 4:
		   service.lengthOfString("     flower king");
		   break;
		   
	   case 5:
		   service.subString("flowerking");
		   break;
		   
	   case 6:
		   service.usingCharAtIndexOf("poo123@gmail.com");
		   break;
		   
	   case 7:
		   service.usingReplace("poo123@.com","flower@.org");
		   break;
		   
	   case 8:
		   service.usingConcate("flower","king");
		   break;
		   
	   case 9:
		   service.usingCompare("flower", "flower");
		   break;
	   case 10:
		   service.usingStringFormat("flower", 97);
		   break;
		   
	   case 11:
		   service.usingstringformat(88,34);
	   default:
		   break;
  
}
	}
}


