package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentMgmtServiceImpl implements StudentMgmtService {
    private StudentDAO dao;
    
	public StudentMgmtServiceImpl(StudentDAO dao) {
		System.out.println("StudentMgmtServiceImpl::1-param constructor");
		this.dao = dao;
	}

	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
        int total=0;
		float avg=0.0f;
		int count=0;
		StudentBO bo=null;
		String result=null;
		//write b.logic
      total=dto.getM1()+dto.getM2()+dto.getM3();
      avg=total/3.0f;
      if(dto.getM1()<35||dto.getM2()<35||dto.getM3()<35)
    	  result= "Failure";
      else
		result= "Success";
        bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSaddr(dto.getSaddr());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//use DAO
		count=dao.insert(bo);
		//process result
		if(count==0)
			return "Student Registration Failed -->result::"+result;
		else
			return "Student Registration Succeded -->result::"+result;
	}

}
