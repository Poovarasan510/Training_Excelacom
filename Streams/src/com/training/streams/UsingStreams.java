package com.training.streams;
import java.util.*;
import static java.util.stream.Collectors.*;


public class UsingStreams {
	
	public static void useDistinct(List<Book>bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
		
	}
	
	public static void collectToSet(List<Book>bookList) {
		
		Set<Book> bookSet=bookList.stream().filter(e->e.getPrice()>500).collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	public static void findMaxPrice(List<Book> bookList)
	{
		Optional<Book> optional=
				  bookList.stream().max(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent())
			 System.out.println("maximum price"+optional.get().getPrice());
				  
	}
	public static void findCountBooksWithGivenChar(List<Book> bookList,String srchString)
	{
	 long counts=bookList.stream()
				.filter(e->e.getBookName().contains(srchString)).count();
		
		System.out.println(srchString+":present in:"+counts);
	}
	
	public static void findMinPrice(List<Book> bookList)
	{
		Optional<Book> optional=
				  bookList.stream().min(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent())
			 System.out.println("maximum price"+optional.get().getPrice());
				  
	}
	
	public static void  collectToMap(List<Book>bookList) {
		
	//	Set<Book>bookSet=bookList.stream().collect(toSet());
		
		Map<String,Double>values=bookList.stream()
				.filter(e->e.getPrice()>500)
				.collect(toMap(Book::getBookName,Book::getPrice));
		
		
		
		values.forEach((key,value)->System.out.println(key+","+value));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","mad",650);
		Book maven=new Book(104,"Maven","harish",550);
		Book html=new Book(107,"html","priya",1450);
		Book python=new Book(109,"python","sathya",850);
		Book mavenNew=new Book(104,"Maven","harish",550);
		Book htmlNew=new Book(107,"html","priya",1450);
		
		List<Book>bookList=Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key to proceed");
		int key=sc.nextInt();
		switch(key)
		{
		case 1:
			useDistinct(bookList);
			break;
			
		case 2:
			collectToMap(bookList);
			break;
		
		case 3:	
			collectToSet(bookList);
			break;
			
		case 4:
			findMaxPrice(bookList);
			break;
					
		case 5:
			findMinPrice(bookList);
			break;
			
		case 6:
			 findCountBooksWithGivenChar(bookList,"html");
			 break;
			
		}
		
		
	}

}

