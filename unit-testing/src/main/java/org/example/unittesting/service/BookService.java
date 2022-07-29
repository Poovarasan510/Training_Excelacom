package org.example.unittesting.service;



import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.example.unittesting.Book;

public class BookService  {
	
	private Set<Book> bookList;
	
	public BookService() {
		super();
		this.bookList = new HashSet<>();
	}
	
	public Set<Book> getBookList(){
		return this.bookList;
	}
	
	public int addBook(Book book) {
		return (this.bookList.add(book)?1:0);
	}

	public boolean removeBook(Book book) {
		Boolean result = false;
		if(this.bookList.contains(book)) {
			this.bookList.remove(book);
			result= true;
		}else {
			throw new RuntimeException("Element Not Found");
		}
		return result;
	}
	
	public List<String> getBestBooks(){
		
		List<String> list = Arrays.asList("Head First Java","PassBook","HarryPotter");
		return list;
		
	}

}
