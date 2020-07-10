package com.nt.beans;

public class DHL implements Courier {
   public DHL() {
	System.out.println("DHL:0-param Constructor");
}
   public String deliver(int oid) {
	   return "DHL is Delivering "+oid+" order is Product ";
   }
}
 