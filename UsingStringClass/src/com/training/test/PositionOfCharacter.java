package com.training.test;

import java.util.ArrayList;
import java.util.List;

public class PositionOfCharacter {

	public static void main(String[] args) {
		
		List<Integer> alist=new ArrayList<Integer>();
		alist.add(1);
		alist.add(5);
		alist.add(2);
		alist.add(1);
		alist.add(2);
		alist.add(6);
		alist.add(7);
		alist.add(1);
		System.out.println(alist);
	
		int position=alist.indexOf(2);
		System.out.println(position);	
		
	}
}


