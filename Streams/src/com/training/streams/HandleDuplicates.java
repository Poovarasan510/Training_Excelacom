package com.training.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.*;


public class HandleDuplicates {

	public static void main(String[] args) {
		
		List<Integer> ageList=
				  Arrays.asList(45,55,65,78,55,80,45);
		
		Set<Integer> filtered=new HashSet<>();
		
		List<Integer> list =
				ageList.stream()
				.filter(e-> !filtered.add(e))
				.collect(toList());
		
		System.out.println(list);
		
	}

}