package com.date_time_exercise;

import java.sql.*;
import java.time.*;
import java.util.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		
		//step 1 creating util date
		java.util.Date date1=new java.util.Date();
		System.out.println(date1);
        System.out.println(date1.getTime());
	//	java.sql.Date date2=new java.sql.Date(102000);
		java.sql.Date date2=new java.sql.Date(date1.getTime());
		System.out.println(date2);
         //sql date to localdate
		LocalDate localDate=date2.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		//step 4 local date to sql date
		
		java.sql.Date sqlDate2=new java.sql.Date(localDate.toEpochDay());
		System.out.println("sql date 2:"+sqlDate2);
	}

}
