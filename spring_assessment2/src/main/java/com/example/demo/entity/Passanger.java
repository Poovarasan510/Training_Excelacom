package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="flower_passanger")

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Passanger {

	@Id
	@Column(name="passenger_Id")
	int passengerId;


	@Column(name="passanger_Name")
	String passangerName;
	
	@Column(name="email")
	String email;
	
	@Column(name="location")
	String location;
	
	@OneToMany(targetEntity=TripHistory.class,fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="passenger_ref",referencedColumnName="passenger_Id")
	List<TripHistory> tripHistory;
	
}
