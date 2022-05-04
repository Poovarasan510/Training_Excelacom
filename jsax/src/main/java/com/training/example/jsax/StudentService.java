package com.training.example.jsax;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
	
	private List<Student>studentList;
	
	public StudentService(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}
	
	public StudentService() {
		super();
		this.studentList= new ArrayList<Student>();
		
	}
	public boolean add(Student student) {
	return this.studentList.add(student);
	
}
	
//	public void setStudentList(List<Student>studentList) {
//		this.studentList=studentList;
//	}
	
//	public List<Student> getStudentList() {
//		return studentList;
//	}
	
	public List<Student>getAll(){
		
		return this.studentList;
}
	
	public Optional<Student> findById(int id) {
	return this.studentList.stream()
			.filter(e->e.getRollNumber()==id)
			.findFirst();
}

	public boolean remove(int id) {
	return this.studentList.removeIf(e->e.getRollNumber()==id);
}
	
	public Student update(Student oldValue,Student newValue) {
	int idxPos= this.studentList.indexOf(oldValue);
	return this.studentList.set(idxPos, newValue);
	
}
	
}
