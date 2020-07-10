package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MainController controller=null;
		 Scanner sc=null;
	     String cno=null,cname=null,cadd=null,pamt=null,rate=null,time=null;
	     CustomerVO vo=null;
	     String result=null;
		//create IOC Container
	     ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	     //get Controller class obj
	     controller=ctx.getBean("controller",MainController.class);
	     //read inputs and create VO class obj having those inputs
	     sc=new Scanner(System.in);
	    	 System.out.println("Enter  Customer number");
	    	 cno=sc.next();
	    	 System.out.println("Enter  Customer name");
	    	 cname=sc.next();
	    	 System.out.println("Enter  Customer addrs");
	    	 cadd=sc.next();
	    	 System.out.println("Enter  Customer Principle amount");
	    	 pamt=sc.next();
	    	 System.out.println("Enter  Customer rate of intrest");
	    	 rate=sc.next();
	    	 System.out.println("Enter  Customer time of loan");
	    	 time=sc.next();
	    	 vo=new CustomerVO();
	    	 vo.setCustNo(cno);
	    	 vo.setCustname(cname);
	    	 vo.setCustAddr(cadd);
	    	 vo.setpAmt(pamt);
	    	 vo.setRate(rate);
	    	 vo.setTime(time);
	    	 
	    	 //invoke method
	    	 try {
	    		result=controller.processCustomer(vo);
	    		System.out.println(result);
	    	 }
	    	 catch(Exception e) {
	    		 e.printStackTrace();
	    		 System.out.println("Internal Problem");
	    	 }
	    	 
	}//main
}//class