package org.example.service;

import java.util.List;
import java.util.Optional;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;
public class StudentService {
	
	private StudentRepository repo;
	
	
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public Student add(Student entity)
	{
		return this.repo.add(entity);
	}

	public List<Student> findAll()
	{
		return this.repo.findAll();
	}
	
	public int findStudentSize()
	{
		return this.repo.findAll().size();
	}
	
	public Student addElement(Student entity)
	{
		
		Student obj=null;
 	if(Student.getRollNumber()<2000)
	{
			this.repo.add(entity);
			obj=entity;
		}
	
	return obj;
	}

	public Optional<Student> findById(int i ) {
		Optional<Student> found =  this.repo.findById(i);
		
		return found;
	}
	
	public Optional<Student> deleteById(int id) {
		return this.repo.deleteById(id);
	}

		
	}
	
	
		



