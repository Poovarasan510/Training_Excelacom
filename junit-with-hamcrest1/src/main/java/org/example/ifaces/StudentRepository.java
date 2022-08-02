package org.example.ifaces;

import java.util.List;
import java.util.Optional;

import org.example.model.Student;

public interface StudentRepository {

	public Student add(Student entity);
	public List<Student> findAll();
	public Optional<Student> findById(int i);
	public Optional<Student> deleteById(int id);
	
}
