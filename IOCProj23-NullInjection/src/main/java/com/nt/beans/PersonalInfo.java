package com.nt.beans;

import java.util.Date;

public class PersonalInfo {
     private int aid;
     private String name;
     private Date dob;
     private Date doj;
	public PersonalInfo(int aid, String name, Date dob, Date doj) {
		System.out.println("PersonalInfo::4-param Constructor");
		this.aid = aid;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "PersonalInfo [aid=" + aid + ", name=" + name + ", dob=" + dob + ", doj=" + doj + "]";
	}
     
}
