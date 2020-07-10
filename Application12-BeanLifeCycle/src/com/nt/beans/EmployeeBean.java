package com.nt.beans;

public class EmployeeBean {
     		static {
     			System.out.println("Loading Class...");
     		}
     		public EmployeeBean() {
             System.out.println("Class Instatiations...");
     		}
     		public String sayHello() {
     			return "Mukesh Patel";
     		}
}

