package com.nt.beans;

public class EmployeeBean {
     		private int eno;
     		private String ename;
     		private String addr;
     		private float sal;
			public int getEno() {
				return eno;
			}
			public void setEno(int eno) {
				this.eno = eno;
			}
			public String getEname() {
				return ename;
			}
			public void setEname(String ename) {
				this.ename = ename;
			}
			public String getAddr() {
				return addr;
			}
			public void setAddr(String addr) {
				this.addr = addr;
			}
			public float getSal() {
				return sal;
			}
			public void setSal(float sal) {
				this.sal = sal;
			}
			public void getEmpDetalis() {
				System.out.println("-------------------");
				System.out.println("Employee Details::");
				System.out.println("Employee Number      ::"+eno);
				System.out.println("Employee Name          ::"+ename);
				System.out.println("Employee Address      ::"+addr);
				System.out.println("Employee Salary          ::"+sal);
			}
}

