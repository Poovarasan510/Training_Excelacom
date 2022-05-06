package com.example.demo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Component
@FieldDefaults(level=AccessLevel.PRIVATE)
@Getter
@ToString
@NoArgsConstructor
public class Bill {
	Customer customer;
	Product product;
	
	@Autowired
	public void setCustomer(@Qualifier("ramesh") Customer customer) {
		System.out.println("Set customer called***");
		this.customer = customer;
	}
	
	@Autowired
	public void setProduct(Product product) {
		System.out.println("set product called***");
		this.product = product;
	}
	
	

}
