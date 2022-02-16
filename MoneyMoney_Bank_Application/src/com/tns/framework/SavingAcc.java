package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{
	
	private boolean isSalaried;
	private static float MINBAL;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public void withdraw(float amount) {
//		long amt ;  
//        System.out.println("Enter the amount you want to withdraw: ");  
//        amt = sc.nextLong();  
//        amt= (Long) null;
//        if(amt>=MINBAL)
//        {
//        if (accBal >= amt) {  
//        	accBal = accBal - amt;  
//            System.out.println("Balance after withdrawal: " + accBal);  
//        } else {  
//            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
//        }  
//        }
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		return  super.toString();
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalary(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
}
