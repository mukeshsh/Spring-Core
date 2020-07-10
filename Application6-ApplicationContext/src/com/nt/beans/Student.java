package com.nt.beans;

   public class Student{
			private int sid;
     		private String sname;
     		private String saddr;
     		private float salary;
     		private int deptno;
			public int getSid() {
				return sid;
			}
			public void setSid(int sid) {
				this.sid = sid;
			}
			public String getSname() {
				return sname;
			}
			public void setSname(String sname) {
				this.sname = sname;
			}
			public String getSaddr() {
				return saddr;
			}
			public void setSaddr(String saddr) {
				this.saddr = saddr;
			}
			public float getSalary() {
				return salary;
			}
			public void setSalary(float salary) {
				this.salary = salary;
			}
			public int getDeptno() {
				return deptno;
			}
			public void setDeptno(int deptno) {
				this.deptno = deptno;
			}
			public void getStdDetails() {
				System.out.println("-------------------------------------");
				System.out.println("Student Details");
				System.out.println("Student No                          ::"+sid);
				System.out.println("Student Name                    ::"+sname);
				System.out.println("Student Address                ::"+saddr);
				System.out.println("Student Salary                    ::"+salary);
				System.out.println("Student Department No  ::"+deptno);
			}
}

