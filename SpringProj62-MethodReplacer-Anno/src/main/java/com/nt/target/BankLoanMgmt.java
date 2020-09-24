package com.nt.target;

public class BankLoanMgmt {
	//final not overriden
  public final float calculateIntrAmt(float pAmt,float rate,float time) {
	  System.out.println("BankLoanMgmt.calculateIntrAmt()::Compound Intrest Amount");
	  return (float) (pAmt*(Math.pow(1+rate/100, time))-pAmt);
  }
}
