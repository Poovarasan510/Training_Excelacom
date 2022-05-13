package com.example.demo.utils.bidirectional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.ifaces.bidirectional.DoctorRepository;
import com.example.demo.ifaces.bidirectional.PatientRepository;
import com.example.demo.training.entiry.bidirectional.Doctor;
import com.example.demo.training.entiry.bidirectional.Patient;

@Component
public class Utility {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientrepo;
	
	
	public void create()
	{
		for(Patient eachPatient: patientList)
		{
		eachPatient.setDoctor(doc);
		patientrepo.save(eachPatient);
		}
		Doctor added=repo.save(doc);
		
		if(added!=null)
		{
			System.out.println("one record added");
		}
	}
	
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
	public void findDoctorFrmPatient() 
	{
		Patient entity=patientrepo.findById(301).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}
	}

