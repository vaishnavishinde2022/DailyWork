package com.application.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Instructor
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private int id;

	private String email;
	private String first_Name;
	private String last_Name;
	
	@OneToOne(cascade=CascadeType.ALL)
	/*
	 * @JsonManagedReference is the forward part of reference,the one that gets serialized normally.
	 */
	@JsonManagedReference
	@JoinColumn(name="instrctorDetails_id")
	private InstrctorDetails instrctorDetails;
		

	public Instructor(int id, String email, String first_Name, String last_Name, InstrctorDetails instrctorDetails) 
	{
		super();
		this.id = id;
		this.email = email;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.instrctorDetails = instrctorDetails;
	}
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
	
	

	public String getFirst_Name()
	{
		return first_Name;
	}

	public void setFirst_Name(String first_Name)
	{
		this.first_Name = first_Name;
	}
	
	

	public String getLast_Name() 
	{
		return last_Name;
	}

	public void setLast_Name(String last_Name)
	{
		this.last_Name = last_Name;
	}
	
	

	public InstrctorDetails getInstrctorDetails() 
	{
		return instrctorDetails;
	}

	public void setInstrctorDetails(InstrctorDetails instrctorDetails)
	{
		this.instrctorDetails = instrctorDetails;
	}

	@Override
	public String toString() 
	{
		return "Instructor [id=" + id + ", email=" + email + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", instrctorDetails=" + instrctorDetails + "]";
	}


	

	
	
	
}
