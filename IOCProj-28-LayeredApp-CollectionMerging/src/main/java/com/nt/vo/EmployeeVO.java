package com.nt.vo;

public class EmployeeVO {
	private String ename;
	private String eadd;
	private String salary;

	public EmployeeVO() {
		System.out.println("EmployeeVO::0-param Constructor");
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	
}
