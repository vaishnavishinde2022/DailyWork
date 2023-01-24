package com.application.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class InstrctorDetails
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private int id;
	private String hobby;
	private String youtube_channel;
	
	@OneToOne(mappedBy="instrctorDetails")
	/*
	 * @JsonBackReference is the back part of reference;it will be omitted from serialization.
	 */
	@JsonBackReference
	private Instructor instructor;
	
	public InstrctorDetails(int id, String hobby, String youtube_channel, Instructor instructor) 
	{
		super();
		this.id = id;
		this.hobby = hobby;
		this.youtube_channel = youtube_channel;
		this.instructor = instructor;
	}
	
	public InstrctorDetails() 
	{
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
	

	public String getHobby() 
	{
		return hobby;
	}

	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	
	

	public String getYoutube_channel()
	{
		return youtube_channel;
	}

	public void setYoutube_channel(String youtube_channel)
	{
		this.youtube_channel = youtube_channel;
	}
	
	

	public Instructor getInstructor() 
	{
		return instructor;
	}

	public void setInstructor(Instructor instructor) 
	{
		this.instructor = instructor;
	}

	@Override
	public String toString() 
	{
		return "InstrctorDetails [id=" + id + ", hobby=" + hobby + ", youtube_channel=" + youtube_channel
				+ ", instructor=" + instructor + "]";
	}

	

	

	
}
