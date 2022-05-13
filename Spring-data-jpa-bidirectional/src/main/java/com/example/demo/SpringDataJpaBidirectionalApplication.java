package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.demo.training.entiry.bidirectional.Doctor;
import com.example.demo.training.entiry.bidirectional.Patient;
import com.example.demo.utils.bidirectional.Utility;

@SpringBootApplication
public class SpringDataJpaBidirectionalApplication {

	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaBidirectionalApplication.class, args);
	
	Utility repo=ctx.getBean(Utility.class);
	
	repo.create();
	repo.findAll();
	repo.findDoctorFrmPatient();
	
	ctx.close();
	}
	
	@Bean
	public Doctor krishna() {
		Doctor doc = new Doctor();
		doc.setDoctorId(201);
		doc.setDoctorName("krishna");
		doc.setDepartment("ent");
		doc.setPhoneNumber(4839763);
		
		return doc;
	}

	@Bean
	public Patient ravi()
	{
		Patient patients=new Patient();
		patients.setPatientId(301);
		patients.setPatientName("Ravikumar");
		patients.setMobileNumber(8963789);
		
		return patients;
	}
	
	@Bean Patient siva()
	{
		Patient patients=new Patient();
		patients.setPatientId(302);
		patients.setPatientName("siva");
		patients.setMobileNumber(878788);
		
		return patients;
	}

}
