package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	private Courier courier;
	private long regNo;
	
	public FlipKart() {
		System.out.println("FlipKart::0-param Constructor");
	}
	public FlipKart(Courier courier) {
		System.out.println("FlipKart::1-param Constructor");
		this.courier = courier;
	}
	public void setCourier(Courier courier) {
		System.out.println("FlipKart.setCourier()");
		this.courier = courier;
	}
	public void setRegNo(long regNo) {
		System.out.println("FlipKart.setRegNo()");
		this.regNo = regNo;
	}
	
	public  String  shopping(String[] items,float[] prices) {
		System.out.println("Flipkart.shopping()-->regNo::"+regNo);
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
