package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.entiry.Doctor;



public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

List<Doctor> findByDoctorName(String srchName);	

List<Doctor> findByMobileNumber(long mobileNumber);

@Query(value="from Doctor where department=:srchValue")
List<Doctor> searchByDepartment(@Param("srchValue") String department);	

@Query(value="update Doctor set mobileNumber=:updatedMobile where doctorId=:srchId")
@Modifying
@Transactional
int modifyMobileNumber(@Param("srchId") int doctorId,@Param("updatedMobile") long updatedMobile);


}
