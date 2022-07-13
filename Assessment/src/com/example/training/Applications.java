package com.example.training;

import static java.util.stream.Collectors.toMap;

import java.util.*;
import java.util.stream.Collectors;

public class Applications {
	

	public static void findPlaceByCountry(List<StreamsExample> obj,String searchName)
	{
		List<String> name=obj.stream().filter(e->e.getCountryName().contains(searchName))
				 .map(d->d.getPlace())
				 .collect(Collectors.toList());
		
		name.forEach(System.out::println);
		
	}
	 

	public static void countMethod(List<StreamsExample> streamobj ,String searchName)
	{
	long countTimes=streamobj.stream().filter(e->e.getCountryName().contains(searchName)).count();
	System.out.println(searchName+"occurs:"+countTimes+"times");
	}
	
	public static void countryWithTotalPopulation(List<StreamsExample> objs,String searchName)
	{
		
		Long total=objs.stream().filter(e->e.getCountryName().contains(searchName))
		    .mapToLong(d -> d.getPopulation()).sum();
		
	System.out.println(searchName+"total population:"+total);
	}


	public static void main(String[] args) {
		
		StreamsExample usa= new StreamsExample("USA","Kansas city",501957);
		StreamsExample india=new StreamsExample("India","Chennai",7090000);
	    StreamsExample usa1=new StreamsExample("USA","LosAngeles",3970000);
	    StreamsExample nepal=new StreamsExample("Nepal","Kathmandu",1000000);
	    StreamsExample india1=new StreamsExample("India","Kolkata",14900000);
	    StreamsExample america=new StreamsExample("USA","Denver",706000);
		
		List<StreamsExample> countryLists=Arrays.asList(usa,india,usa1,nepal,india1,america);	
	
	System.out.println("To find the country by lists(Usa):");
	
	findPlaceByCountry(countryLists,"USA");
	
	System.out.println("To find the country by lists(India):");
	findPlaceByCountry(countryLists,"India");
	
	System.out.println("To find the country by lists(Nepal):");
	findPlaceByCountry(countryLists,"Nepal");
	
	System.out.println("Total Number of time India had occured:");
	
	countMethod(countryLists,"India");
	
	System.out.println("Total number of times Nepal had occured");
	countMethod(countryLists,"Nepal");
	
	System.out.println("Total number of times USA had occured");
	countMethod(countryLists,"USA");
	
	System.out.println("to find total population of country:");
	
	countryWithTotalPopulation(countryLists,"USA");
	
		
		
		
		}

	}


