package com.nt.beans;

public final class BlueDart implements Courier {

	public BlueDart() {
    System.out.println("BlueDart.BlueDart()");
	}
	@Override
	public String deliver(int oid) {
		return "BlueDart courier will deliver order id:"+oid+" order Products";
	}

}
