package com.example.demo.model;


import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Component;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
public class Teacher {
	
	int id;
	String name;
	String subject;

}
