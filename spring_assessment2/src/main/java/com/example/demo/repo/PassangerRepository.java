package com.example.demo.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Passanger;


public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

List<Passanger> findByPassangerName(String name);
	

	List<Passanger> findByTripHistoryTripDateTime(LocalDateTime time); 
}
