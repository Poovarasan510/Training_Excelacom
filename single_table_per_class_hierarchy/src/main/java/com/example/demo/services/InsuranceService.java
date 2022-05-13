package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.Insurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

@Service
public class InsuranceService {
	
	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance life;
	
	public void addHealthPolicy()
	{
		Object obj=repo.save(entity);
		
		if(obj!=null)
		{
			System.out.println("one recorded added");
		}
	}
	

	
	public void getHealthPolicy()
	{
		repo.findAll().forEach(System.out::println);
	
	
	}
	
	public void addLifePolicy()
	{
		Object obj=repo.save(life);
		
		if(obj!=null)
		{
			System.out.println("one recorded added");
		}
	}

	public void getAllPolicy()
	{
		repo.findAll().forEach(System.out::println);
		
	}
}
