package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.HelloBean;
import com.nt.beans.WelcomeMsg;
import com.nt.config.AppConfig;

public class Test {

	public static void main(String[] args) {
      ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
      String[] beanNames=ctx.getBeanDefinitionNames();
      for(String beanName:beanNames) {
    	  System.out.println(beanName);
      }
		/*
		  WelcomeMsg msg=(WelcomeMsg) ctx.getBean("getWelcomeMsg");
		  System.out.println(msg.getWelcomeMsg()); HelloBean helloBean=(HelloBean)
		  ctx.getBean(HelloBean.class); System.out.println(helloBean.getSayHello());
		 */
		/*
		 * System.out.println("------------------------"); WelcomeMsg
		 * msg1=ctx.getBean(WelcomeMsg.class); System.out.println(msg.getWelcomeMsg());
		 * System.out.println(msg); System.out.println(msg1);
		 * System.out.println(msg==msg1);
		 */
	}

}
