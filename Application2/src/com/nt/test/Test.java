package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
     HelloBean hello=(HelloBean) context.getBean("helloBean");
    // hello.setName("Mukesh");
     System.out.println(hello.sayHello());
    
	}

}
