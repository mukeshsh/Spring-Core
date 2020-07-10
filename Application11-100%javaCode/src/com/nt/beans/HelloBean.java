package com.nt.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean Loading..........");
	}
	 public HelloBean() {
   System.out.println("HelloBean Instantions.......");
	 }
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String sname;
     public String getSayHello() {
    	 return "Hey "+sname+" How are you ?";
     }
}
