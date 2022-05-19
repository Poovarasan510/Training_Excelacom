package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class SpringDriverClientsApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext ctx=		SpringApplication.run(SpringDriverClientsApplication.class, args);

	Client client=ctx.getBean(Client.class);
	
	System.out.println(client.invokeGetAll());
	
//	Driver[] list=client.invokeAllAsObject();
//	
//	for(Driver eachDriver:list)
//	{
//		System.out.println("Driver id:"+eachDriver.getDriverId());
//		System.out.println("Driver name:"+eachDriver.getDriverName());
//		System.out.println("Mobile number:"+eachDriver.getMobileNumber());
//		System.out.println("Rating:"+eachDriver.getRating());
//	}
//	System.out.println("element added:");
//	client.add();
	ctx.close();
	}

//	@Bean
//	public RestTemplate template() {
//		return new RestTemplate();
//	}
	@Bean
	public RestTemplate template() {
		RestTemplate template=new RestTemplate();
		
		template.getInterceptors().add(interceptor());
		return template;
	}
	
	@Bean
	public BasicAuthenticationInterceptor interceptor()
	{
		return new BasicAuthenticationInterceptor("India", "India");
	}
}
