package com.jpa.test;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/*
 * CrudRepository is an interface that contain methods for CRUD operations.
 * It is defined in the package org.springframework.data.repository
 * If we want to use CrudRepository in an application,we have to create an interface and extends the CrudRepository.
 * 
 * public interface CrudRepository<T,ID> extends Repository<T,ID>
 * where T :=Domaim type that repository manages(Generally the Entity/Model class name).
 * ID :=type of the id of the Entity that repository manages(Generally the wrapper class of your @Id that is created inside the Entity / Model class)
 */

public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
	public List<Employee> findByName(String name);
	   
	   public List<Employee> findByNameAndAddress(String name,String city);
	   
	   public List<Employee> findByNameStartingWith(String prefix);
	   
	   public List<Employee> findByNameEndingWith(String suffix);
	   
	   public List<Employee> findByNameOrderByName(String name);
 
}
