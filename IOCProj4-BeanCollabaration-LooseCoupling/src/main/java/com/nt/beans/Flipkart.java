package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	   public Flipkart(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart:1-param Constructor");
	}
	public String shopping(String[] items,float[] prices) {
	 float billAmt=0.0f;
	 int oid=0;
	 String msg=null;
		//generate Bill amount
		for(float price:prices)
			billAmt=billAmt+price;
		//generate oid
		oid=new Random().nextInt(1000);
		//use dependent
		msg=courier.deliver(oid);
		 return Arrays.toString(items)+"are shopped having prices"+Arrays.toString(prices)+"with billAmount ::"+billAmt+"Delievery Status::"+msg;
	}//shopping
}//class
