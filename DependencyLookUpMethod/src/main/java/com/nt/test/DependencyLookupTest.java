package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class DependencyLookupTest {

	public static void main(String[] args) {

		  ApplicationContext ctx=null;
		  Vehicle vehi=null;
		  ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		  vehi=ctx.getBean("vehicle",Vehicle.class);
		  //invoked b.method
		  vehi.journey("Delhi","Jaunpur");
		  vehi.entertainment();
		  vehi.soundHorn();
		  vehi.fillFuel();
		  ((AbstractApplicationContext) ctx).close();	
	}

}
