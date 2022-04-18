package com.date_time_exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student ram=new Student(101,"ram",LocalDate.of(1972, 10, 12),
		         LocalDateTime.of(2000, Month.JUNE,5,9,30));

Student shyam=new Student(101,"shyam",LocalDate.now(),
        LocalDateTime.now());

System.out.println("rams year of birth" + ram.getDateOfBirth().getYear());
		
System.out.println("Ram first birthday"+ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
System.out.println("syams year of birth"+ shyam.getDateOfBirth().getYear());
System.out.println("shyam sixth birthday"+shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));

System.out.println("shyam previous birthday"+shyam.getDateOfBirth().minus(2,ChronoUnit.MONTHS));
	}

}
