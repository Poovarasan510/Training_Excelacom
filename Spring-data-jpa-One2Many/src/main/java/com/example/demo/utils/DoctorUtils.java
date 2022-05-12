package com.example.demo.utils;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entiry.Doctor;
import com.example.demo.entiry.Patient;
import com.example.demo.ifaces.DoctorRepository;

@Component
public class DoctorUtils {

	
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create()
	{
		doc.setPatientList(patientList);
		
		Doctor added=repo.save(doc);
		
		if(added!=null)
		{
			System.out.println("one record added");
		}
	}
	
	@Transactional
	public void findAll()
	{
		
	List<Doctor> doc=repo.findAll();
	
	for(Doctor eachDoctor:doc)
	{
		System.out.println("Doctor Name"+eachDoctor.getDoctorName());
		System.out.println("department:"+eachDoctor.getDepartment());
		
		List<Patient> patients=eachDoctor.getPatientList();
		
		for(Patient eachPatient:patients)
		{
			System.out.println("Patient name:"+eachPatient.getPatientName());
			System.out.println("Patient number:"+eachPatient.getMobileNumber());
		}
	}
	}
	
}
