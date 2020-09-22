package com.nt.beans;

public final class FirstFlight implements Courier {

	public FirstFlight() {
    System.out.println("FirstFlight.FirstFlight()");
	}
	@Override
	public String deliver(int oid) {
		return "FirstFlight courier will deliver order id:"+oid+" order Products";
	}

}
