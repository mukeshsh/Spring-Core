package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fflight")
@Lazy(true)
@Primary
public final class FirstFlight implements Courier {

	public FirstFlight() {
    System.out.println("FirstFlight::0-param Constructor");
	}
	@Override
	public String deliver(int oid) {
		return "FirstFlight courier will deliver order id:"+oid+" order Products";
	}

}
