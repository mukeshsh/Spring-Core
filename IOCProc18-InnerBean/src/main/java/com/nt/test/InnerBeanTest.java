package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankAccount;
import com.nt.beans.BankCustomer;

public class InnerBeanTest {

	public static void main(String[] args) {
	 ApplicationContext context=null;
	 BankCustomer customer=null;
	 BankAccount account=null;
	 //create IOC Container
	 context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
      //get target bean class object
	 customer=context.getBean("mukeshCustomer", BankCustomer.class);
	 System.out.println("Account Balance Details::"+customer.getBalance());
	 System.out.println(customer);
	 System.out.println("--------------------------------------");
	}

}
