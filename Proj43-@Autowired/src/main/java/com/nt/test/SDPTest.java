package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.FlipKart;

public class SDPTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 FlipKart fpkt=null;
		//create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get Bean
		fpkt=ctx.getBean("fkt",FlipKart.class);
		//invoke the methods
		System.out.println(fpkt.shopping(new String[] {"PPEKit"," MASK","Sanitizer"},new float[] {2000,500,200}));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
