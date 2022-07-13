package com.example.demo.entity;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.CabDriver;
import com.example.demo.services.CabDriverServices;

@RestController
@RequestMapping(path="/api/v1/drivers")
public class CabDriverController {

	
	@Autowired
	private CabDriverServices service;
	
	@PostMapping
	public CabDriver add(@RequestBody CabDriver entity)
	{
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<CabDriver> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public CabDriver findById(@PathVariable("id") int id)
	{
		return this.service.findById(id).orElseThrow(()->new RuntimeException("Element not found"));
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void removeById(@PathVariable("id") int id)
	{
	           this.service.remove(id);	
	}
}
