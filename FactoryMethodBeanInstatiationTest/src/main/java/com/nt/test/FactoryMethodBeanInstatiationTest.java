package com.nt.test;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodBeanInstatiationTest {

	public static void main(String[] args) {
    
		ApplicationContext ctx=null;
		Calendar cal=null;
		Class c1=null;
		Connection con=null;
		Properties props=null;
		String str1=null;
		String str2=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		c1=ctx.getBean("c1",Class.class);
		System.out.println(c1.getClass().getName()+"  "+c1.toString());
		System.out.println("..............................................................");
		cal=ctx.getBean("cal1",Calendar.class);
		System.out.println("cal obj class name::"+cal.getClass().getName()+" cal obj data::"+cal.toString());
		System.out.println("---------------------------------------");
		con=ctx.getBean("con",Connection.class);
		System.out.println(con);
		System.out.println("con obj class name::"+con.getClass().getName()+" con obj data::"+con.toString());
		System.out.println("-------------------------------------------------------------------------------");
		props=ctx.getBean("sys",Properties.class);
		System.out.println("Props obj class name"+props.getClass().getName()+" Properties Object Date "+props.toString());
		System.out.println("----------------------------------------------");
		str1=ctx.getBean("s1",String.class);
		System.out.println("Str1 object class name "+str1.getClass().getName()+" String Object Data "+str1.toString());
		System.out.println("---------------------------------------------------");
		str2=ctx.getBean("s2",String.class);
		System.out.println("str2 object class name "+str2.getClass().getName()+" String Object Data "+str2.toString());
	}

}
