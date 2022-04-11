package com.training.example;

import java.util.List;
import java.util.ArrayList;

public class BookService implements CrudRepository {
	
	private ArrayList<Book> bookList;

	public BookService() {
		super();
		this.bookList=new ArrayList<Book>();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		Book found=null;
		for(Book eachBook:this.bookList)
		{
			if(eachBook.getBookNumber()==id)
				 found=eachBook;
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}
	
	public Book update(Book book)
	{
		if(this.bookList.contains(book))
		{
			System.out.println("inside if block");
			
		}
		else
		{  System.out.println("add book:");
			add(book);
		}
		return null;
	}

}
