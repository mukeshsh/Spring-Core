package com.nt.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.EmployeeBean;

public class Test {

	public static void main(String[] args) {
   AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    EmployeeBean bean=(EmployeeBean) ctx.getBean("empBean");
    System.out.println(bean.sayHello());
    ctx.registerShutdownHook();
	}

}
