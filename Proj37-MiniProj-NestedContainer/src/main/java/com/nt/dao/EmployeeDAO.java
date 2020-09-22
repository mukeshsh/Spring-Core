package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
  public List<EmployeeBO> getAllEmpsByLoc(String loc1,String loc2,String loc3)throws Exception;
}
