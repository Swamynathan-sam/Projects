package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingsAcc extends SavingAcc
{
	private static float MINBAL;
	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
		MINBAL=getAccBal();
		if(amount>MINBAL) {
			System.out.println("Insufficient balance!!!");
		}else {
			setAccBal(getAccBal()-amount);
			System.out.println("Transaction successfully completed");
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}