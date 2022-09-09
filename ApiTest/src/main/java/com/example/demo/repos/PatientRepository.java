package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiry.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
