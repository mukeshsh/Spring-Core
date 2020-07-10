package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Vehicle;

public class StrategyDPTest {

	public static void main(String[] args) {
     ApplicationContext ctx=null;
     Vehicle vehicle=null;
     ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
     vehicle=ctx.getBean("ve",Vehicle.class);
     //invoked method
     vehicle.journey("Delhi", "Mariahu");
	}

}
