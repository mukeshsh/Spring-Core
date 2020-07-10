package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		//Locate And Hold Spring bean cfg file
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		generator=(WishMessageGenerator)context.getBean("wmg");
		//invoked bussiness method
		System.out.println("result::"+generator.generateMessage("Mukesh Patel "));
	}

}
