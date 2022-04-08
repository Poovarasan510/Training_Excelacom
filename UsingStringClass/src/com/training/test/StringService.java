package com.training.test;

public class StringService {
	
	public void stringEquals(String str1,String str2)
	{
		System.out.println("is value same:"+str1.equals(str2));
		System.out.println(str1==str2);
	
	}
	
	public void stringObjectEquals()
	{
		String ram=new String("ram");
		String ramesh=new String("ram");
		
		System.out.println("is value same:"+ram.equals(ramesh));
		System.out.println("are they pointing to same location"+ram==ramesh);
		}
	
	public void usingTrim(String name)
	{     
		System.out.println("without trim:"+name);
		System.out.println("trim:"+name.trim());
		
	}
	public void lengthOfString(String name)
	{
		System.out.println("String length:"+name.length());
		System.out.println("string length after trim"+name.trim().length());
	}
	
	public void subString(String name)
	{
		System.out.println("substring of name"+name.substring(5));
		System.out.println("substring of name"+name.substring(3,7));
	}
	
	public void usingCharAtIndexOf(String name)
	{
		System.out.println("Index position of @"+name.indexOf('@'));
		System.out.println("character at 3;"+name.charAt(3));
	}
	
	public void usingReplace(String str1,String str2)
	{
		System.out.println(str1.replace(".com", ".org"));
	}
	
	public void usingConcate(String str1,String str2)
	{
		//string is immutable
		System.out.println(str1.concat(str2));
		
		//stirng builder is mutable
		
		StringBuilder build=new StringBuilder();
		build.append(str2);
		System.out.println(build.toString());
		
	}
	
	public void usingCompare(String str1,String str2)
	{
		System.out.println(str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1,double mark)
	{
		String frmtString=String.format("Name %s", str1);
		System.out.println(frmtString);
		System.out.println(String.format("mark %.2f",mark));
	}	
	
	public void usingstringformat(int mark1,int mark2)
	{
	System.out.println(String.format("%1$s,%2$s",mark1,mark2));

	}
	}
