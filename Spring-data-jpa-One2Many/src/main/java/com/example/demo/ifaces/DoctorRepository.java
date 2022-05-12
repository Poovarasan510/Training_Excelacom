package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiry.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
