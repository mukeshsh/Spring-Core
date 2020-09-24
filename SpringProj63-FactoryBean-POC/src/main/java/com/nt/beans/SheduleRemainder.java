package com.nt.beans;

import java.time.LocalDate;

public class SheduleRemainder {
   private LocalDate date;

public SheduleRemainder(LocalDate date) {
	System.out.println("SheduleRemainder::1-param Constructor");
	this.date = date;
}
   public String remainder() {
	   LocalDate sysDate=null;
	   //get System DAte
	   sysDate=LocalDate.now();
	   if(sysDate.equals(date))
		   return "Remainder about board Meetings";
	   else
		   return "Today no appoinment.....Relax";
   }
   
}
