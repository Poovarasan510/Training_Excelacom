package com.training.example.ifaces;

import java.util.List;

public interface CrudRepository<T>
{
	public int add(T obj);
	
	public List<T> findAll();
	public int remove(int id);
	public T findById(int id);
	public int updateByName(String name,double obj);

}
