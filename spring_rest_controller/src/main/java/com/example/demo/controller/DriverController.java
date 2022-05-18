package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping(path="/api/v1")
public class DriverController {
	
	private DriverService service;
@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	@GetMapping(path="/drivers")
	public List<Driver>getAllDriver(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id){
		return this.service.findById(id);
	}
	
	@GetMapping(path="/drivers/searchbyname/{driverName}")
	public List<Driver> getDriverByName(@PathVariable("driverName") String driverName)
	{
		return this.service.findByDriverName(driverName);	}
	
	@GetMapping(path="/drivers/searchbynumber/{mobilenumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber") long number)
	{
		return this.service.srchByMobileNumber(number);
	}
	
	@GetMapping(path="/driver/srch/{rating}")
	public List<Driver> getDriverByRating(@PathVariable("rating") double rating)
	{
		return this.service.srchByDriverRating(rating);
	}
	
	 
    @PutMapping(path ="/drivers/updated/{id}/{rating}")
    public ResponseEntity<String> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating){
   	 int rowsUpdated=this.service.updateRating(id ,updatedRating);
   	 return ResponseEntity.status(HttpStatus.OK).body(rowsUpdated+"updated");
   	 
    }
    
    @GetMapping(path="/drivers/sort/{propName}")
    public List<Driver> getDriverNameBySort(@PathVariable("propName")String propName)
    {
    	return this.service.sortedList(propName);
    }
    
@PostMapping(path="/drivers")
public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
	Driver driver= this.service.add(entity);
	
	URI location=ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")    //http://localhost:8080/api/v1/drivers/{id}
			.buildAndExpand(driver.getDriverId())
			.toUri();
	return ResponseEntity.created(location).body(driver);
	
	//return ResponseEntity.status(HttpStatus.CREATED).body(driver);
}
@DeleteMapping(path="/drivers/remove/{id}")
public String removeDriver(@PathVariable("id") int id)
{
	 return this.service.delete(id);
}
}