package com.nt.beans;

public class BankAccount {
	private long accNo;
	private String holderName;
	private float balance;
	private boolean NRIBankingEnable;


	public BankAccount() {
		System.out.println("BankAccount::0-param Constructor");
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}


	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	
	public boolean isNRIBankingEnable() {
		return NRIBankingEnable;
	}

	public void setNRIBankingEnable(boolean nRIBankingEnable) {
		NRIBankingEnable = nRIBankingEnable;
	}

	public float showBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", holderName=" + holderName + ", balance=" + balance
				+ ", NRIBankingEnable=" + NRIBankingEnable + "]";
	}

}

