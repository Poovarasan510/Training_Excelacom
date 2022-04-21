package com.training.example;

import java.io.File;

public class Testing {

	public static void main(String[] args)
	{
		
		BookService service=new BookService();
		Book book = new Book(884,"Oracle","Harish",789);
		File file=new File("book.ser");
		
		
		int ch=2;
		if(ch==1)
		{
		
		boolean result=service.writeToStream(file, book);
		
		if(result)
		{
			System.out.println("one record serialized");
		}
		}
		else
		{ Book fromFile=
		      (Book) service.readFromStream(file);
		System.out.println(fromFile);
		}
			
		}
	}


