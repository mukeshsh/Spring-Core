package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bike;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Bike bike=null;
		// create Container
      ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
      //get bean object
      bike=ctx.getBean("mjBike", Bike.class);
      System.out.println(bike);
      System.out.println("====================");
      bike=ctx.getBean("djBike", Bike.class);
      System.out.println(bike);
      
	}

}
