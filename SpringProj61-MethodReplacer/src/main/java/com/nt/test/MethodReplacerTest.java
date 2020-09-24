package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.BankLoanMgmt;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankLoanMgmt mgmr=null;
		//create IOC
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target class object
		mgmr=ctx.getBean("bank",BankLoanMgmt.class);
		System.out.println(mgmr.getClass()+"  "+mgmr.getClass().getSuperclass());
		//invoked methods
		System.out.println("Intrest Amount::"+mgmr.calculateIntrestAmount(10000, 2, 12));
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
