package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class BeanCollabarationTest {
    public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Flipkart flipkart=(Flipkart) ctx.getBean("fkart",Flipkart.class);
		System.out.println(flipkart.shopping(new String []{"shirt","trouser","sweets","crackers"}, new float[] {1000,2000,3000,40000}));
	}
}
