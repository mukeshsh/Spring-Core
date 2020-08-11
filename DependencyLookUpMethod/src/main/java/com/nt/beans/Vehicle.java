package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
    private String beanid;

	public Vehicle(String beanid) {
		System.out.println("Vehicle::1-param constructor");
		this.beanid = beanid;
	}
	public void entertainment() {
		System.out.println("Vehicle.entertainment()");
	}
	public void soundHorn() {
		System.out.println("Vehicle.soundHorn()");
	}
	public void fillFuel() {
		System.out.println("Vehicle.fuelFill()");
	}
	public void journey(String srcPlace,String destPlace) {
		System.out.println("Vehicle.journey()");
		
		ApplicationContext ctx=null;
		Engine engine=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("extra container");
		engine=ctx.getBean(beanid,Engine.class);
		engine.start();
		System.out.println("Jorney Statertd ::"+srcPlace);
		engine.stop();
		System.out.println("Journey stoped ::"+destPlace);
	}
    
}
