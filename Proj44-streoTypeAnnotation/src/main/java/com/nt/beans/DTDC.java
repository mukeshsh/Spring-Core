package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy
public final class DTDC implements Courier {
	public DTDC() {
    System.out.println("DTDC::0-param Constructor");
	}
	@Override
	public String deliver(int oid) {
		return "DTDC courier will deliver order id:"+oid+" order Products";
	}

}
