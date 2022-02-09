package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingsAcc extends SavingAcc
{
	private float MINBAL;
	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		super.withdraw(accBal);
	}

	@Override
	public String toString() {
		return "MMSavingsAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}