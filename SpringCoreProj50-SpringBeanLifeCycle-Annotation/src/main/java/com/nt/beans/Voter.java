package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("voter")
public class Voter {
	@Value("Navya")
    private String name;
	@Value("21")
    private float age;
    private Date dov;
    

    //custom life cycle method..
   @PostConstruct 
    public void myInit() {
    	System.out.println("Voter.myInit()");
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
    //custome destroy methos
   @PreDestroy
    public void myDestroy() {
    	System.out.println("Voter.myDestroy()");
    	//nullify bean properties
    	name=null;
    	age=0.0f;
    	dov=null;
    }
    //b.method
    public String checkVotingElgibility() {
    	System.out.println("Voter.checkVotingElgibility()");
    	if(age>=18)
    		return "Mr/Miss/Mrs."+name+ "  you  are  eglible for voting::"+age+"-->  on  ->"+dov;
    	else
    		return "Mr/Miss/Mrs."+name+ "  you  are not eglible for voting::"+age+"-->  on  ->"+dov;
    }
}
