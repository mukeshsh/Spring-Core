package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;
public class BankServiceMgmtImpl implements BankServiceMgmt {
    private CustomerDAO dao;
    
	public BankServiceMgmtImpl(CustomerDAO dao) {
		System.out.println("BankServiceMgmtImpl::1-Pram-Customer");
		this.dao = dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		float intrAmt=0.0f;
		CustomerBO bo=null;
		int count=0;
		//calculate Interest amount  (b.logic)
		intrAmt=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		//prepare BO class obj having persistable data...
		bo=new CustomerBO();
		bo.setCustNo(dto.getCustNo());
		bo.setCustName(dto.getCustName());
		bo.setCustAddr(dto.getCustAddr());
		bo.setpAmt(dto.getpAmt());
		bo.setIntrAmt(intrAmt);
		//use DAO
		count=dao.insert(bo);
		//process the result
		if(count==0)
			  return "Customer Registration Failed :: IntrAmt is "+intrAmt;
		else
			  return "Customer Registration Succeded :: IntrAmt is "+intrAmt;
	}//method

}//class