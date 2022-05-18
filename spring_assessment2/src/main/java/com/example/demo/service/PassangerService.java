package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passanger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassangerRepository;

@Service

public class PassangerService {

	
	PassangerRepository repo;
	
	
 @Autowired
	public PassangerService(PassangerRepository repo) {
		super();
		this.repo = repo;
	}

	public Passanger addPassanger(Passanger entity)
	{
	 	return this.repo.save(entity);
	}
	
	public List<Passanger> findAll()
	{
		return this.repo.findAll();
	}
	public List<Passanger> findByPassangerName(String srch)
	{
		return this.repo.findByPassangerName(srch);
	}
	
	public List<Passanger> findByPassengerTripHistoryTripDateTime(LocalDateTime time)
	{
		return this.repo.findByTripHistoryTripDateTime(time);
	}
		
}
