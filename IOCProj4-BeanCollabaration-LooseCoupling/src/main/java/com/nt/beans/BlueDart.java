package com.nt.beans;

public class BlueDart implements Courier{
	 public BlueDart() {
		System.out.println("BlueDart:0-param Constructor");
	}
	 public String deliver(int oid) {
		 return "BlueDard is Delevering " +oid+ " order id products";
	 }

}
