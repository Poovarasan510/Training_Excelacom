package com.example.demo.controller;


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
import com.example.demo.service.DoctorService;
import com.example.demo.entiry.*;


@RestController
@RequestMapping(path="/api/v1")
public class DoctorController {
	
	private DoctorService service;
	
    @Autowired
	public DoctorController(DoctorService service) {
		super();
		this.service = service;
	}
    
	@GetMapping(path="/doctor")
	public List<Doctor> getAllDoctor()
    {
		return this.service.findAll();
	}
	
	@GetMapping(path="/doctor/{id}")
	public Doctor getDoctorById(@PathVariable("id") int id)
	{
		return this.service.findById(id);
	}
	
	@GetMapping(path="/doctors/searchbyname/{DoctorName}")
	public List<Doctor> getDoctorByName(@PathVariable("DoctorName") String DoctorName)
	{
		return this.service.findByDoctorName(DoctorName);	
		
	}
	
	@GetMapping(path="/doctors/searchbynumber/{mobileNumber}")
	public List<Doctor> getDoctorByMobileNumber(@PathVariable("mobileNumber") long number)
	{
		return this.service.srchByMobileNumber(number);
	}
	
	@GetMapping(path="/doctor/srch/{Department}")
	public List<Doctor> getDoctorByDepartment(@PathVariable("Department") String PatientName)
	{
		return this.service.srchByDepartment(PatientName);
	}
	
    
   @PostMapping(path="/doctor/add")
   public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor entity)
   {
	Doctor doctor= this.service.add(entity);
	return ResponseEntity.status(HttpStatus.CREATED).body(doctor);
   }
   
   @PostMapping(path="/patient/add")
   public ResponseEntity<Patient> addPatient(@RequestBody Patient entity)
   {
	   Patient patient=this.service.addPatient(entity);
	   return ResponseEntity.status(HttpStatus.CREATED).body(patient);
   }
 
   @DeleteMapping(path="/doctor/remove/{id}")
  public String Doctor(@PathVariable("id") int id)
  {
	 return this.service.delete(id);
  }
   
   @PutMapping(path ="/doctor/updated/{id}/{mobile}")
   public ResponseEntity<String> updateRating(@PathVariable("id")int id,@PathVariable("mobile")long updatedMobileNumber){
  	 int rowsUpdated=this.service.updateMobileNumber(id ,updatedMobileNumber);
  	 return ResponseEntity.status(HttpStatus.OK).body(rowsUpdated+"updated");
  	 
   }
   
}