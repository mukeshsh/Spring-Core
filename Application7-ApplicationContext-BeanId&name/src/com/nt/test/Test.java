package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;

public class Test {

	public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
		
		  Student std=(Student) context.getBean("stdBean"); 
		  std.getStdDetails();
		 
    Student std1=(Student) context.getBean("stdBean2");
    std.getStdDetails();
    Student std2=(Student) context.getBean("stdBean3");
    std.getStdDetails();
    Student std3=(Student) context.getBean("stdBean1");
    std.getStdDetails();
   
    System.out.println(std1);
    System.out.println(std2);
    System.out.println(std);
	}

}
