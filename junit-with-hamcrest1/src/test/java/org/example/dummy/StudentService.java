package org.example.dummy;

import java.util.List;

import org.example.fake.StudentRepoFake;
import org.example.model.Student;

public class StudentService {
	
	private StudentRepoFake fake;
	
	private DummyProfessorRepository dummy;

	public StudentService(StudentRepoFake fake, DummyProfessorRepository dummy) {
		super();
		this.fake = fake;
		this.dummy = dummy;
	}

	public Student add(Student entity)
	{
		return this.fake.add(entity);
	}

	public List<Student> findAll()
	{
		return this.fake.findAll();
	}
	

}
