package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.ifaces.SeminarRepository;
import com.example.demo.seminar.Seminar;
import com.example.demo.speaker.Speaker;

@Component
public class SeminarUtils {
	
	@Autowired
	Speaker speaker;
	
	@Autowired
	Seminar sem;
	
	@Autowired
	SeminarRepository repo;
	
	public void create()
	{
		sem.setSpeaker(speaker);
		
		Seminar added=repo.save(sem);
		
		if(added!=null)
		{
			System.out.println("one record added");
		}
	}
	
	public void findAll()
	{
		repo.findAll().forEach(System.out::println);
	}

}
