package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;

public class Test {

	public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
    Student std=(Student) context.getBean("stdBean");
    std.getStdDetails();
	}

}
