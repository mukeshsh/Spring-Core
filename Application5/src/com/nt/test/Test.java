package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.EmployeeBean;

public class Test {

	public static void main(String[] args) {
    Resource resource=new ClassPathResource("/com/nt/cfgs/applicationContext.xml");
    BeanFactory bf=new XmlBeanFactory(resource);
    System.out.println(resource.getFilename());
     EmployeeBean emp=(EmployeeBean) bf.getBean("empBean");
    
	}

}
