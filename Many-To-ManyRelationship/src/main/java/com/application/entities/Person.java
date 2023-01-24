package com.application.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.FetchType;
import jakarta.persistence.CascadeType;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private int PID;
	private String personName;
	   
	 @ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	 @JoinTable(name="My_Third_Table",joinColumns=
	 {
        @JoinColumn(name="P_ID")},inverseJoinColumns= {@JoinColumn(name="Mob_Id")})
	 
	   private List<Mobile>mobile;
	   
   public Person(int pID, String personName, List<Mobile> mobile) 
   {
		super();
		PID = pID;
		this.personName = personName;
		this.mobile = mobile;
	}

 public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public int getPID()
   {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}
	

	public String getPersonName() 
	{
		return personName;
	}

	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}
	

	public List<Mobile> getMobile()
	{
		return mobile;
	}

	public void setMobile(List<Mobile> mobile)
	{
		this.mobile = mobile;
	}


}
