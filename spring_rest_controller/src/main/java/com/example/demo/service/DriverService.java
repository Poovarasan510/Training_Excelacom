package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repos.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository repo;
	
	
	public List<Driver>findAll(){
		return this.repo.findAll();
	}
	
	public Driver add(Driver entity) {
		return this.repo.save(entity);
		
	}
	
	public Driver findById(int id)
	{
		return this.repo.findById(id).orElseThrow(()->new RuntimeException(id+"not found"));
	}
	public String delete(int id) {
		String message;
		try {
		 this.repo.deleteById(id);
		 message="One element deleted";
		 return message;
		 
		 
		} catch (Exception e) {
			
			e.printStackTrace();

			message="Not found";
			
			
		}
		return message;
	

	}
	
	public List<Driver> findByDriverName(String srchName)
	{
		return this.repo.findByDriverName(srchName);
	}
	
	public List<Driver> srchByMobileNumber(long number)
	{
		return this.repo.findByMobileNumber(number);
	}
	
	public List<Driver> srchByDriverRating(double rating)
	{
		return this.repo.searchByRating(rating);
	}
	
	public int updateRating(int id,double updatedRating)
	{
		return this.repo.modifyRating(id, updatedRating);
	}
	
	public List<Driver> sortedList(String propName)
	{
		return this.repo.findAll(Sort.by(propName));
	}
}
