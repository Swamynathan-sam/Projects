package com.tns.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	public void withdraw(float amount) {
		  
//        if (accBal >= amt) {  
//        	accBal = accBal - amt;  
//            System.out.println("Balance after withdrawal: " + accBal);  
//        } else {  
//            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
//        }  
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public float getCreditLimit() {
		return creditLimit;
		
	}

}