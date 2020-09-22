package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainControoler {
    
	private EmployeeMgmtService service;

	public MainControoler(EmployeeMgmtService service) {
		System.out.println("MainControoler::1-param construtor");
		this.service = service;
	}
	public List<EmployeeVO> gatherEmpsByLoc(String loc1,String loc2,String loc3)throws Exception{
		List<EmployeeVO> listVO=null;
		List<EmployeeDTO> listDTO=null;
		EmployeeVO vo=null;
		//service
		listDTO=service.fetchAllEmpsByLoc(loc1, loc2, loc3);
		//listDTO to listVO
		listVO=new  ArrayList();
		for(EmployeeDTO dto:listDTO) {
			vo=new EmployeeVO();
			vo.setProjId(String.valueOf(dto.getProjId()));
			vo.setCompany(String.valueOf(dto.getCompany()));
			vo.setCost(String.valueOf(dto.getCost()));
			vo.setLocation(String.valueOf(dto.getLocation()));
			vo.setProjName(String.valueOf(dto.getProjName()));
			vo.setTeamSize(String.valueOf(dto.getTeamSize()));
			BeanUtils.copyProperties(dto, vo);
			listVO.add(vo);
		}
		return listVO;
	}
	
}
