package com.tns.client;

import com.tns.application.*;
import com.tns.framework.*;

public class Client 
{

	public static void main(String[] args) {
		MMCurrentAcc a1=new MMCurrentAcc(3021, "Sam", 100000, 5000);
		MMSavingsAcc a2=new MMSavingsAcc(2121, "Bill", 30000, true);
		String d=a1.toString();
		System.out.println(d);
		String b=a2.toString();
		System.out.println(b);
		//a1.getNewCurrentAccount(3021, "Sam", 10000, 500);
		//a1.getNewSavingsAccount(2121, "Bill", 3000, true);Client
		
		
	}

}
