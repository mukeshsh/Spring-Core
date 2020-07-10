package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	private WishMessageGenerator() {
	 System.out.println("WishMessageGenerator:0-param Constructor");
	}
	
	  private WishMessageGenerator(Date date) {
	  System.out.println("WishMessageGenerator: 1-param Constructor"); 
	  this.date =date; 
	  }
	 

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	public String messageGenerator(String user) {
		int hour=0;
		System.out.println("Inject date ::"+date);
		hour=date.getHours();
		//generate message
		if(hour<12) 
			return "Good Morning :::"+user;
		if(hour<16)
			return "Good Afternoon:::"+user;
		if(hour<20)
			return "Good Evening:::"+user;
		else
			return "Good Night";
	}

}
