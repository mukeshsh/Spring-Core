package com.nt.factory;

import com.nt.beans.EmployeeBean;

public class EmpFactory {
	public EmployeeBean getEmpInstance() {
		System.out.println("EmpFactory.getEmpInstance()");
		return new EmployeeBean();
	}

}
