package com.example.demo.entity;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="flower_triphistory1")

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class TripHistory {

	@Id
	@Column(name="trip_Id")
	int tripId;
	
	@Column(name="tripDateTime")
	LocalDateTime tripDateTime;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	
	@Column(name="source")
	String source;
	
	@Column(name="destination")
	String destination;
	
	@Column(name="amount")
	double amount;
}
