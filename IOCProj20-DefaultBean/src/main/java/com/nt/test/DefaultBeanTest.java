package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class DefaultBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Object message=null;
		//Create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//create bean onject
		message=ctx.getBean("com.nt.beans.WishMessageGenerator#0");
		System.out.println("Result::"+((WishMessageGenerator) message).generateMessage("Mukesh"));

	}

}
