package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("bankCIAR")
public class BankLoanMgmt_CalIntreAmtReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("BankLoanMgmt_CalIntreAmtReplacer.reimplement()::Simple Intrest Amount");
		
		  float pAmt=0.0f;
		  float rate=0.0f;
		  float time=0.0f; 
		
		//get target method args values 
			 pAmt=(float) args[0]; 
			 rate=(float) args[1];
			 time=(float) args[2];
		//write new logics
		return pAmt*rate*time/100.0f;
	}

}
