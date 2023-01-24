package com.jpa.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * @Entity represents a class of type Entity , and correlated with a table in the database.
 * Each object instantiated by this class indicated by this class indicates a tuple of the table itself.
 */
@Entity
public class Employee
{
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
	   private String name;
	   private String address;
	   private String email;
	   private String designation;
	   private String department;
	  
	   
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String address, String email, String designation, String department)
			
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.designation = designation;
		this.department = department;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", designation="
				+ designation + ", department=" + department +  "]";
	}
}
