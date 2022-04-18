package com.date_time_exercise;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dateOfBirth="1999-08-10";
		Student vicky=new Student();
		vicky.setRollNumber(200);
        vicky.setStudentName("vignesh");
        vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
        vicky.setDateOfJoining(LocalDateTime.now());
        
        System.out.println(vicky.getDateOfBirth().getYear());
        
        System.out.println(vicky.getDateOfBirth().getMonth());
        
        System.out.println(vicky.getDateOfBirth().getDayOfMonth());
        
        LocalTime starttime=LocalTime.of(9,30);
        
        LocalTime endTime=starttime.plus(8,ChronoUnit.HOURS);
        System.out.println("start time"+starttime);
        System.out.println("end time:"+endTime);
	}

}
