package com.nt.comp;

public class FirstFlight implements Courier {
     
	public FirstFlight() {
   System.out.println("FirstFlight::0-param Constructor");
	}
	@Override
	public String deliver(int oid) {

		System.out.println("FirstFlight.deliver()");
		return "FirstFlight Courier will deliver  order id :: "+oid +" order  products";
	}

}
