package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.HelloBean;
import com.nt.beans.WelcomeMsg;

@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig Loading.............");
	}
	public AppConfig() {
   System.out.println("AppConfig Instantions..............");
	}
	@Bean
      public WelcomeMsg getWelcomeMsg() {
    	 WelcomeMsg getWelcomeMsg=new WelcomeMsg();
    	 getWelcomeMsg.setName("Mukesh");
    	 return getWelcomeMsg;
	}
	@Bean
	public HelloBean getHelloBeanhello() {
		HelloBean getHelloBean=new HelloBean();
		getHelloBean.setSname("Patel");
		return getHelloBean;
	}
}
