package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@Component
public class Client {

	String BASEURL="http://localhost:8080/api/v1/users";
	private RestTemplate template;
   
	@Autowired
	public Client(RestTemplate template) {
		super();
		this.template = template;
	}
	//print in json format
	public String invokeGetAll()
	{
		
		return template.getForObject(BASEURL,String.class);
	}
	//print in java object
	public Driver[] invokeAllAsObject()
	{
		return template.getForObject(BASEURL, Driver[].class);
	}
	
	public void add()
	{
		HttpHeaders header=new HttpHeaders();
	header.setContentType(MediaType.APPLICATION_JSON);
	
	
	HashMap<String,Object> map=new HashMap<>();
	map.put("driverId", 988);
	map.put("driverName", "sriharish");
	map.put("mobileNumber", 9989080);
	map.put("rating", 8.9);
	
	HttpEntity<Map<String,Object>> entity=new HttpEntity(map,header);
	
	ResponseEntity<Driver> respo=this.template.postForEntity(BASEURL,entity,Driver.class);

	System.out.println("Status code:"+respo.getStatusCodeValue());
	System.out.println("Body:"+respo.getBody());
	System.out.println("Location:"+respo.getHeaders().get("location"));
	
	}

}
