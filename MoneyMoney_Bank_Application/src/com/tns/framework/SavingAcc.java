package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	final static private float MINBAL=500;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		super.withdraw(accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
