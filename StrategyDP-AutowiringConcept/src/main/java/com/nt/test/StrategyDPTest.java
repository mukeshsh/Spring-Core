package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.FlipKart;

public class StrategyDPTest {

	public static void main(String[] args) {
     
		ApplicationContext ctx=null;
		FlipKart fkt=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	     fkt=ctx.getBean("fkt",FlipKart.class);
	     try {
	    	 System.out.println(fkt.shopping(new String[] {"PPEKit"," MASK","Sanitizer"},new float[] {2000,500,200}));
	     }
	     catch(Exception e) {
	    	 e.printStackTrace();
	     }
	     ((AbstractApplicationContext) ctx).close();
	}

}
