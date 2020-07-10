package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeBean {
     	private String name;
     	private String msg;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			System.out.println("EmployeeBean.setName()");
			this.name = name;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			System.out.println("EmployeeBean.setMsg()");
			this.msg = msg;
		}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("EmployeeBean.afterPropertiesSet()"); name="raja";
	 * msg="Namaste"; }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("EmployeeBean.destroy()"); }
	 */
		/*public void init() {
			System.out.println("EmployeeBean.init()");
			name="Mukesh";
			//msg="Good Morning";
		}
		public void destroy() {
			System.out.println("EmployeeBean.destroy()");
			name="";
			msg="";
		}*/
	
	  public String sayHello() { return "name=" + name + ", msg=" + msg + "!"; }
	 
		@PostConstruct
		public void InitializeBean() {
			System.out.println("EmployeeBean.InitializeBean()");
			name="Ravan";
			msg="Welcome to Lanka";
		}
		@PreDestroy
		public void DestoryBean() {
			System.out.println("EmployeeBean.DestoryBean()");
		}
}

