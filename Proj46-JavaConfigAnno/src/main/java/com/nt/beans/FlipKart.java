package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;


@Named("fpk")
public final class FlipKart {

	//@Inject
	@Named("fflight")
  private Courier courier;
	
	@Inject
	private Date date;
   public FlipKart() {
	System.out.println("FlipKart.FlipKart()");
}
		public  String  shopping1(String[] items,float[] prices) {
			System.out.println("Flipkart.shopping()::: "+date);
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
