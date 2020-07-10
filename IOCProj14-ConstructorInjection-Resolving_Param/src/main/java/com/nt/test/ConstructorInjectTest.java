package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ConstructorInjectTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Student st=null;
		Student std=null;
		Marks ms=null;
		// create IOC Container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean object
		st=context.getBean("st", Student.class);
		System.out.println(st);
		System.out.println("------------------------");
		ms=context.getBean("ms", Marks.class);
		System.out.println(ms);
		System.out.println("------------------------");
		std=context.getBean("st1", Student.class);
		System.out.println(std);
		
	}

}
