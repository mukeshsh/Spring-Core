package com.nt.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Required;

public class Employee implements Serializable {
    private Integer eid;
    private String ename;
    private String eaddr;
    private float salary;
    private int deptNo;
    private String email;
    
    @Required
	public void setEid(int eid) {
		this.eid = eid;
	}
    @Required
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Required
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Required
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddr=" + eaddr + ", salary=" + salary + ", deptNo="
				+ deptNo + ", email=" + email + "]";
	}
    
}
