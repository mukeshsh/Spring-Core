package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDILayeredApplTest {

	public static void main(String[] args) {
		

		ApplicationContext ctx=null;
		Scanner sc=null;
		EmployeeVO vo=null;
		String ename=null,eadd=null,bsal=null;
		MainController controller=null;
		String result=null;
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter employee name::");
		ename=sc.next();
		System.out.println("Enter Employee Address::");
		eadd=sc.next();
		System.out.println("Enter Employee basic Salary::");
		bsal=sc.next();
		//create EmployeeVO class object
		vo=new EmployeeVO();
		vo.setEname(ename);
		vo.setEadd(eadd);
		vo.setSalary(bsal);
		//create IOC container 
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Controller class obj  from IOC container
		controller=ctx.getBean("controller",MainController.class);
		//invoke method
		try {
			result=controller.processEmployee(vo);
			System.out.println(result);
		}//try
		catch(Exception e) {
			e.printStackTrace();
			if(((SQLException)e).getErrorCode()==1)
				System.out.println("Emplyee already registered ");
			else if(((SQLException)e).getErrorCode()==12899)
				System.out.println("Emplyee info is larger than given col size ");
			else if(((SQLException)e).getErrorCode()==947)
				System.out.println("Emplyee info insufficient to insert ");
			else
				System.out.println("Unknown Internal Problem ");
			
		}
	}//main
}//class

