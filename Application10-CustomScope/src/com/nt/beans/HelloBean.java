package com.nt.beans;

public class HelloBean {
	static {
		System.out.println("Class Loading");
	}
   public HelloBean() {
	   System.out.println("class Instantiation");
   }
   public String sayHello() {
	   return "Hello Mukesh";
   }
}

