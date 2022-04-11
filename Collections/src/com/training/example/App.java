package com.training.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		List<String> names= new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Raju");
		names.add("Pava");
		
		System.out.println((names));
	
		Collections.sort(names);
		System.out.println((names));
		
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","mad",650);
		Book maven=new Book(104,"Maven","harish",550);
		Book html=new Book(107,"html","priya",1450);
		Book python=new Book(109,"python","sathya",850);
		
        CrudRepository service=new BookService();
        System.out.println("IS Added:"+service.add(java));
        service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		List<Book> bookList=service.findAll();
		Collections.sort(bookList);
		System.out.println(bookList);
		
		Collections.sort(bookList,new BookNameComparator());
		System.out.println("sort by book name"+bookList);
		
	}

}
