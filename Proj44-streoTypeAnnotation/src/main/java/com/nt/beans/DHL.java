package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dhl")
@Lazy
public final class DHL implements Courier {

	public DHL() {
    System.out.println("DHL::0-param Constructor");
	}
	@Override
	public String deliver(int oid) {
		return "DHL courier will deliver order id:"+oid+" order Products";
	}

}
