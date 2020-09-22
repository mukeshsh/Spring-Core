package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
      ApplicationContext ctx=null;
      Employee emp=null;
      ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
      emp=ctx.getBean("employee", Employee.class);
      System.out.println(emp);
      
	}

}
