package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.demo.seminar.Seminar;
import com.example.demo.speaker.Speaker;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOne2One1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpaOne2One1Application.class, args);
	
	SeminarUtils obj=ctx.getBean(SeminarUtils.class);
	obj.create();
	obj.findAll();
	
	ctx.close();
	}
	
	
	@Bean
	public Speaker raj()
	{
		Speaker doc = new Speaker();
	    doc.setId(101);
	    doc.setFirstName("rajesh");
	    doc.setQualification("engineer");
		return doc;
	}
	@Bean
	public Seminar tamil()
	{
		Seminar semi=new Seminar();
		semi.setId(201);
		semi.setName("tamil");
		semi.setDuration(10);
		
		return semi;
	}

}
