package com.example.demo.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="flower_employee05")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name="employee_id")
	int employeeId;
	
	@Column(name="employee_name")
	String employeeName;
	
	@Column(name="dateofbirth")
	LocalDate dateOfBirth;
	 
	@Column(name="Location")
	String location;
	
	@Column(name="skillset")
	String skillSet;
	
	

}
