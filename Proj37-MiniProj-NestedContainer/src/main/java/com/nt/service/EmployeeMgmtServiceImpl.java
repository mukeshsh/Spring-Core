package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {

	private EmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(EmployeeDAO dao) {
		System.out.println("EmployeeMgmtServiceImpl::1-param constructor");
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> fetchAllEmpsByLoc(String loc1, String loc2, String loc3) throws Exception {
     List<EmployeeBO> listBO=null;
     List<EmployeeDTO> listDTO=null;
     EmployeeDTO dto=null;
		//convert input upper case
    // loc1=loc1.toUpperCase();
     //loc2=loc2.toUpperCase();
     //loc3=loc3.toUpperCase();
     //use dao
     listBO=dao.getAllEmpsByLoc(loc1, loc2, loc3);
     //convert listBO To listDTO
     listDTO=new ArrayList();
     for(EmployeeBO bo:listBO) {
    	 //copy each bo to dto
    	 dto=new EmployeeDTO();
    	 BeanUtils.copyProperties(bo, dto);
    	 //add each dto
    	 listDTO.add(dto);
     }
		return listDTO;
	}

}
