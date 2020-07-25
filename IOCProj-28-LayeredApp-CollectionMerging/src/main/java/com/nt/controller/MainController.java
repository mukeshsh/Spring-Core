package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.serveice.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeService service;
	public MainController(EmployeeService service) {
		System.out.println("MainController.MainController()");
		this.service = service;
	}
	public String processEmployee(EmployeeVO vo)throws Exception{
		EmployeeDTO  dto=null;
		String result=null;
		dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEadd(vo.getEadd());
		dto.setSalary(Float.parseFloat(vo.getSalary()));
		//use service
		result=service.register(dto);
		return result;
	}

}
