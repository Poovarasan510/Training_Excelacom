package com.example.demo;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passanger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassangerRepository;





@SpringBootApplication
public class SpringAssessment2Application {

	public static void main(String[] args) {
	 SpringApplication.run(SpringAssessment2Application.class, args);
		
	

	}
	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			PassangerRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				TripHistory trip1 = new TripHistory(5671,LocalDateTime.of(2022,11,18,06,30),"chennai","ooty",5000.00);
				List<TripHistory> tripList = new ArrayList<TripHistory>();
				tripList.add(trip1);
				
				 repo.save(new Passanger(101,"leo","leo@gmail.com","chennai",tripList));
			}
		};
	
	}
	
}
