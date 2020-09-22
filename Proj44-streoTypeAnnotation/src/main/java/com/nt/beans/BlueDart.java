package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy
public final class BlueDart implements Courier {

	public BlueDart() {
    System.out.println("BlueDart:0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return "BlueDart courier will deliver order id:"+oid+" order Products";
	}

}
