package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonalInfo;

public class NullInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PersonalInfo info=null;
		// create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//create bean class object
		info=ctx.getBean("info", PersonalInfo.class);
		System.out.println(info);
	}

}
