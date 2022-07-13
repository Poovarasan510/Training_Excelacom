package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CabDriver;

@RestController
@RequestMapping(path="/client")
public class ClientController {
	
	@Autowired
	RestTemplate template;
	
	
	@GetMapping(path="/drivers")
	public String getDrivers()
	{
		//json is nothing but string
		return this.template.
				getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
	}
	
	@GetMapping(path="/drivers/json")
	public CabDriver[] getDriversAsJson()
	{
		//json is nothing but string
		return this.template.
				getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",CabDriver[].class);
	}
	

}
