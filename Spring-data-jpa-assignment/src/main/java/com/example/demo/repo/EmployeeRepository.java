package com.example.demo.repo;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate date);
	
	public List<Employee> findByLocation(String location);
	
	public List<Employee> findBySkillSet(String location);
	
		
		@Query(nativeQuery = true,
				value = "select * from flower_employee05 where location=:location and skillset=:skillSet")
		public List<Employee> getByLocationAndSkillset(@Param("location") String location, @Param("skillSet") String skillSet);

}
