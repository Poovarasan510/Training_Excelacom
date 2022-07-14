package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.TripDetail;
import com.example.demo.repo.TripDetailRepository;

@Service
public class TripDetailService {
	
	private TripDetailRepository repo;

	@Autowired
	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public List<TripDetail> findAll()
	{
		return repo.findAll();
	}
	
	public TripDetail save(TripDetail  entity)
	{
		return repo.save(entity);
	}
	
	public List<TripDetail> findByDriverId(int id)
	{
	 return this.repo.findByDriverId(id);
	}
	
	public void remove(int id)
	{
		Optional<TripDetail> foundElement=repo.findById(id);
		if(foundElement.isPresent())
			{
			repo.deleteById(id);
			}
		else
		{
			throw new RuntimeException("Element with"+id+"not present");
		}
	}
	

}
