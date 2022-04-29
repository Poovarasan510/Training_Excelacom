package com.training.example.jdbc_example;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T>{

	//public boolean add( customer);
	public Optional<LoanApplication> findById(int id);
	public List<LoanApplication> findByAll();
	public int delete(int id);
	public int add(LoanApplication obj);
}
