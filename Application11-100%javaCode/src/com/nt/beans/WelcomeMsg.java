package com.nt.beans;

public class WelcomeMsg {
	static {
		System.out.println("WelcomeMsg Loading......");
	}
	public WelcomeMsg() {
		System.out.println("WelComeMsg Instantions......");
	}
	private String name;
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWelcomeMsg() {
		  return "Hello " +name+ "! Good Morning";
	  }
	 
}

