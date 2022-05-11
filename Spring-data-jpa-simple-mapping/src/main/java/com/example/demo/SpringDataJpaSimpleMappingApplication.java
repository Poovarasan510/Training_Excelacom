package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorServices;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
	
	Doctor varun=ctx.getBean(Doctor.class);
	
	DoctorServices service=ctx.getBean(DoctorServices.class);
	
	service.findByNameAndDept("flower","ens").forEach(System.out::println);
	
	service.findByDept("neurology").forEach(System.out::println);
	
	service.findByNameOrDept("varun","cardio").forEach(System.out::println);
	
	//service.findByDept("cardio").forEach(System.out::println);
	//service.findAll().forEach(System.out::println);
	
//	Doctor added=service.add(varun);
//	
//	if(added!=null)
//	{
//		System.out.println("one doctor info added");
//}
	ctx.close();
	}

	@Bean
	public Doctor varun()
	{
		return new Doctor(202,"Varun","cardio",88989);
	}
}
