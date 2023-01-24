package com.application.entities;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
       private int empId;
	   private String empName;
	  private String designation;
	  
	  @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	  @JoinColumn(name="Employee_empId")
	  private List<Address> address;
	  
	  public Employee(int empId, String empName, String designation, List<Address> address)
		{
			super();
			this.empId = empId;
			this.empName = empName;
			this.designation = designation;
			this.address = address;
		}
	  
  public Employee() 
  {
		super();
		// TODO Auto-generated constructor stub
	}

public int getEmpId()
  {
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	
	

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	

	public String getDesignation() 
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	
	

	public List<Address> getAddress() 
	{
		return address;
	}

	public void setAddress(List<Address> address) 
	{
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", address="
				+ address + "]";
	}

	


}//Employee
