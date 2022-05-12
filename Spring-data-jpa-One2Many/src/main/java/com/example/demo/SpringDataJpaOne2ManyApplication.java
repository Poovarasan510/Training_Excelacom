package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entiry.Doctor;
import com.example.demo.entiry.Patient;
import com.example.demo.utils.DoctorUtils;


@SpringBootApplication
public class SpringDataJpaOne2ManyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOne2ManyApplication.class, args);
	
	DoctorUtils obj = ctx.getBean(DoctorUtils.class);
	
	obj.create();
	obj.findAll();
	
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
	public Patient pavi()
	{
		return new Patient(201,"Pavithra",6838564);
	}
	
	@Bean
	public Patient kavi()
	{
		return new Patient(202,"Kavitha",5758578);
	}
	
	@Bean
	public Patient magi()
	{
		return new Patient(203,"Malathy",9678568);
	}

}