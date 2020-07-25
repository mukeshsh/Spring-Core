package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
      private String ename;
      private String eadd;
      private float salary;
      private float grossSalary;
      private float netSalary;
      
      public EmployeeDTO() {
    	   System.out.println("EmployeeBO::0-param Constructor");
    	      }

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}
          
}
