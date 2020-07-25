package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
      ApplicationContext ctx=null;
      EnggCourse enggCourse=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean Class objects
		enggCourse=ctx.getBean("engg", EnggCourse.class);
		System.out.println(enggCourse);
		System.out.println("=====================");
		enggCourse=ctx.getBean("engg1", EnggCourse.class);
		System.out.println(enggCourse);
	}
}
