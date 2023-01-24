package com.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Mobile 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int MID;
		private String mobileName;
		private String mobileColor;
		
		public Mobile(int mID, String mobileName, String mobileColor) 
		{
			super();
			MID = mID;
			this.mobileName = mobileName;
			this.mobileColor = mobileColor;
		}
		
		public Mobile() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	public int getMID()
	{
		return MID;
	}
	public void setMID(int mID) 
	{
		MID = mID;
	}
	
	
	public String getMobileName()
	{
		return mobileName;
	}
	public void setMobileName(String mobileName)
	{
		this.mobileName = mobileName;
	}
	
	
	public String getMobileColor() 
	{
		return mobileColor;
	}
	public void setMobileColor(String mobileColor) 
	{
		this.mobileColor = mobileColor;
	}
	
	
	
	
   
}
