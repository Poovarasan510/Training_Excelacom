package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CabDriver;



@Repository
public interface CabDriverRepository extends JpaRepository<CabDriver, Integer> {

}
