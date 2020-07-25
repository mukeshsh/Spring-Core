package com.nt.serveice;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;
public class EmployeeServiceImpl implements EmployeeService {
   private EmployeeDAO dao;
   
	public EmployeeServiceImpl(EmployeeDAO dao) {
	System.out.println("EmployeeServiceImpl::1-param Constructor");
	this.dao = dao;
}

	@Override
	public String register(EmployeeDTO dto) throws Exception {
		float grossSalary=0.0f;
		float netSalary=0.0f;
		EmployeeBO bo=null;
		int count=0;
		//write b.logic
		//calculate net ammount
		grossSalary=dto.getSalary()+(dto.getSalary()*0.3f);
		netSalary=grossSalary-(dto.getSalary()*0.2f);
		//prepare BO Object
		bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEadd(dto.getEadd());
		bo.setSalary(dto.getSalary());
		bo.setGrossSalary(dto.getGrossSalary());
		bo.setNetSalary(dto.getNetSalary());
		//use dao
		count=dao.insert(bo);
		//prepare the results
		if(count==1)
			return "Employee Registration Done ::-->"+"BasicSalary ::-->"+dto.getSalary()+"GrossSalary ::-->"+dto.getGrossSalary()+"netSalary ::-->"+dto.getNetSalary();
		else
		 return "Employee Registration Done ::-->"+"BasicSalary ::-->"+dto.getSalary()+"GrossSalary ::-->"+dto.getGrossSalary()+"netSalary ::-->"+dto.getNetSalary();
	}

}
