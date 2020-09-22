package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainControoler;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class NestedContainerTest {

	public static void main(String[] args) {
     ApplicationContext parentCtx=null,childCtx=null;
     EmployeeMgmtService service=null;
     MainControoler controller=null;
     List<EmployeeVO> listVO=null;
     
		//create container
        parentCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		childCtx=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation-beans.xml"},parentCtx);
		controller=childCtx.getBean("controller", MainControoler.class);
		System.out.println("----------------------------------");
	try {
		listVO=controller.gatherEmpsByLoc("Mumbai", "kanpur", "Pune");
		for(EmployeeVO vo:listVO) {
			System.out.println(vo);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	((AbstractApplicationContext) parentCtx).close();
	((AbstractApplicationContext) childCtx).close();
}
}