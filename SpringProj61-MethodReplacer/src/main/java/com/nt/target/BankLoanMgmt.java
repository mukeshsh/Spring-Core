package com.nt.target;

public class BankLoanMgmt {
	//if class take final then overidden not possible
  public  float calculateIntrestAmount(float pAmt,float rate,float time) {
	  System.out.println("BankLoanMgmt.calculateIntrestAmount()::Compound Intrest Amount");
	  return (float) (pAmt*Math.pow(1+rate/100, time))-pAmt;
  }
}
