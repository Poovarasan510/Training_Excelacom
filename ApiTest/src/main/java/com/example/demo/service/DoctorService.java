package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entiry.Doctor;
import com.example.demo.entiry.Patient;
import com.example.demo.repos.DoctorRepository;
import com.example.demo.repos.PatientRepository;


@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository repo;
	
	@Autowired
	private PatientRepository patient;
	
	public List<Doctor>findAll()
	{
		return this.repo.findAll();
	}
	
	public List<Patient> findAllPatient()
	{
		return this.patient.findAll();
	}
	
	public Doctor add(Doctor entity)
	{
		return this.repo.save(entity);	
	}
	
	public Patient addPatient(Patient patient)
	{
		return this.patient.save(patient);
	}
	
	public Doctor findById(int id)
	{
		return this.repo.findById(id).orElseThrow(()->new RuntimeException(id+"not found"));
	}
	
	public String delete(int id) 
	{
		String message;
		try
		{
		 this.repo.deleteById(id);
		 message="One element deleted";
		 return message;	 
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();

			message="Not found";		
			
		}
		return message;
	

	}
	
	public List<Doctor> findByDoctorName(String srchName)
	{
		return this.repo.findByDoctorName(srchName);
	}
	
	public List<Doctor> srchByMobileNumber(long number)
	{
		return this.repo.findByMobileNumber(number);
	}
	
	public List<Doctor> srchByDepartment(String Department)
	{
		return this.repo.searchByDepartment(Department);
	}
	
	public int updateMobileNumber(int id,long updatedRating)
	{
		return this.repo.modifyMobileNumber(id, updatedRating);
	}

}
