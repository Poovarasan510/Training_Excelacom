package org.example.stub;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentRepositoryStub implements StudentRepository {

	@Override
	public Student add(Student entity) {
		return null;
	}

	@Override
	public List<Student> findAll() {
		return Arrays.asList(new Student(202,"sriharish"),new Student(203,"Suryaprakash"));
	}

	@Override
	public Optional<Student> findById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Student> deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
