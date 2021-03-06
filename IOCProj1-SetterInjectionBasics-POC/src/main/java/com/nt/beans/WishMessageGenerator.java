package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-param-constructor");
	}
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public String generateMessage(String user) {
		int hour=0;
		System.out.println("Inject Date  ::"+date);
		//get current hour of the day
		hour=date.getHours();
		if(hour<12)
			return "Good Morning ::"+user;
		if(hour<16)
			return "Good Afternoon::"+user;
		if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
		
	}

}
