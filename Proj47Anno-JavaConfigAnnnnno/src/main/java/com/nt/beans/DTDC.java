package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public final class DTDC implements Courier {

	public DTDC() {
    System.out.println("DTDC.DHL()");
	}
	@Override
	public String deliver(int oid) {
		return "DTDC courier will deliver order id:"+oid+" order Products";
	}

}
