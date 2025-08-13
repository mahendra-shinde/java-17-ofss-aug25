//a Non-Abstract (Concrete Class)
package com.mahendra.demo6;


public class SavingAccount extends Account{
	private static double  MIN_BALANCE= 1000;
	private static double roi = 4.5;
	
	public SavingAccount() {
	}

	public SavingAccount(String accNum, String holderName, double balance) {
		super(accNum, holderName, balance);
	}

	
}
