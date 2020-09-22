package com.nt.beans;

import javax.inject.Named;

@Named("dhl")
public final class DHL implements Courier {

	public DHL() {
    System.out.println("DHL.DHL()");
	}
	@Override
	public String deliver(int oid) {
		return "DHL courier will deliver order id:"+oid+" order Products";
	}

}
