package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Voter implements InitializingBean, DisposableBean {
	private String name;
	private float age;
	private Date dov;

	@Override
	public void destroy() throws Exception {
		System.out.println("Voter.destroy()");
		//nullify bean properties
		name=null;
		age=0.0f;
		dov=null;

	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Voter.afterPropertiesSet()");		
		dov=new Date();
		boolean flag=false;
		if(name==null) {
			System.out.println("name must not be null");
			flag=true;
		}
		if(age<0) 
			age=age*-1;
		if(age>100) {
			System.out.println("age must not greater than 100");
			flag=true;
		}
		if(flag)
			throw new IllegalArgumentException("Invalid data");
	}
	public String checkVotingElgibility() {
		System.out.println("Voter.checkVotingElgibility()");
		if(age>=18)
			return "Mr/Miss/Mrs."+name+ "  you  are  eglible for voting::"+age+"-->  on  ->"+dov;
		else
			return "Mr/Miss/Mrs."+name+ "  you  are not eglible for voting::"+age+"-->  on  ->"+dov;
	}


}

