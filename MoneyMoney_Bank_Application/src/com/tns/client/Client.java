package com.tns.client;

import java.util.Scanner;

import com.tns.application.*;
import com.tns.framework.*;

public class Client 
{
	private static BankFactory factory;
	private static SavingAcc savingAcc;
	private static CurrentAcc currentAcc;
	
	public static void main(String[] args) {

		factory = new MMBankFactory();
		
		 
		savingAcc = factory.getNewSavingsAccount(1234, "Sam", 200000, true);
		System.out.println(savingAcc.getAccBal());
		savingAcc.withdraw(2000);
		System.out.println("Your Account balance is "+savingAcc.getAccBal());

		currentAcc = factory.getNewCurrentAccount(1256, "qwerty", 1000000, 50000);
		currentAcc.withdraw(5000);
		System.out.println("Your Account balance is "+currentAcc.getAccBal());
		
		System.out.println(currentAcc.toString());
		System.out.println(savingAcc.toString());
		
		
	}

}