package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.seminar.Seminar;

public interface SeminarRepository extends JpaRepository<Seminar, Integer> {

}
