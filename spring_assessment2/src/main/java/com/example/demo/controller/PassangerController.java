
package com.example.demo.controller;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Passanger;
import com.example.demo.service.PassangerService;


@RestController
@RequestMapping(path="/api/v1")
public class PassangerController {
	
	private PassangerService service;

	@Autowired
	public PassangerController(PassangerService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(path="/passangers/srchbyname/{name}")
	public List<Passanger> getPassangerByName(@PathVariable("name") String name)
	{
		return service.findByPassangerName(name);
	}
	
	@GetMapping(path="/passangers/findall")
	public List<Passanger> getPassangerDetails()
	{
		return service.findAll();
	}
	@GetMapping(path = "/passengers/srch/time/{tripListTripDateTime}")
	public List<Passanger> findByPassengerTripHistoryTripDateTime(@PathVariable("tripListTripDateTime")
	@DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime time){
		return this.service.findByPassengerTripHistoryTripDateTime(time);

	}
	@PostMapping(path="/passangers")
	public ResponseEntity<Passanger> addDriver(@RequestBody Passanger entity) {
		Passanger passanger= this.service.addPassanger(entity);
		
		URI location=ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")   
				.buildAndExpand(passanger.getPassengerId())
				.toUri();
		return ResponseEntity.created(location).body(passanger);
	
	}
}
