package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.College;
import com.nt.beans.FacultiesInfo;
import com.nt.beans.FruitStore;
import com.nt.beans.Marks;
import com.nt.beans.PersonalInfo;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Marks marks=null;
		PersonalInfo info=null;
		College clg=null;
		FacultiesInfo finfo=null;
		FruitStore fstore=null;
		
		// create IOC Container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean class object
		marks=context.getBean("mk", Marks.class);
		System.out.println(marks);
		System.out.println("--------------------------------");
		clg=context.getBean("clg", College.class);
		System.out.println(clg);
	    System.out.println("-------------------------------------");
	    info=context.getBean("pinfo",PersonalInfo.class);
	    System.out.println(info);
	    System.out.println("------------------------------------");
	    finfo=context.getBean("props",FacultiesInfo.class);
	    System.out.println(finfo);
	    System.out.println("--------------------------------------");
	    fstore=context.getBean("fruit",FruitStore.class);
	    System.out.println(fstore);
	    
	}

}
