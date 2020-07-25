package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
    
	public WishMessageGenerator() {
    System.out.println("WishMessageGenerator::0-param-Constructor");
	}
    //setter method supporting setter Injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	public String generateMessage(String user) {
		int hour=0;
		System.out.println("Injected Date::"+date);
		//get current hour of the day
		hour=date.getHours();
		//generate wish messages
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night ::"+user;
	}
	
}
