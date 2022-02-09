package com.tns.framework;

public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingsAccount(int accNo, String accNm, float accBal, boolean isSalaried);
	public abstract SavingAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
}
