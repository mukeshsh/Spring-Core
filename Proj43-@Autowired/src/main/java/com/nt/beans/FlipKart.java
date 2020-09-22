package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FlipKart {

	@Autowired
	@Qualifier("dhl")
  private Courier courier;
	
	@Autowired
	private Date sysDate;
	
	/*
	  @Autowired(required = true)
	  public FlipKart(@Qualifier("bDart") Courier courier, Date sysDate) {
		  this.courier = courier; this.sysDate = sysDate; 
		  }
	 */


	public String shopping(String[] items,float[] prices) {
		System.out.println("System Date::"+sysDate);
		 float billAmt=0.0f;
		 int oid=0;
		 String msg=null;
		 Random rad=null;
		//calculate  bill Amount
		 
		 for(float p:prices) 
			// billAmt=billAmt+p;
			 billAmt+=p;
		 //generate  order id dynamically as random number
		 rad=new Random();
		 oid= rad.nextInt(10000);
		 // use courier service for delivering the  products
		 msg=courier.deliver(oid);
		 // retrun bill Amt and courier details to customer
		return  Arrays.toString(items)+" are purchased  having prices "+Arrays.toString(prices)+"  with bill amount"+billAmt+ "----"+ msg;
	}

}

