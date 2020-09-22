package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgmtService {
   public List<EmployeeDTO> fetchAllEmpsByLoc(String loc1,String loc2,String loc3)throws Exception;
}
