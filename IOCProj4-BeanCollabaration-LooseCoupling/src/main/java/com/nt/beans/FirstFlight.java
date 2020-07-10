package com.nt.beans;

public class FirstFlight implements Courier {
   public FirstFlight() {
	System.out.println("FirstFlight:0-param Constructor");
}
   public String deliver(int oid) {
	   return "FirstFlight is Delivering "+oid+" order is Product ";
   }
}
 