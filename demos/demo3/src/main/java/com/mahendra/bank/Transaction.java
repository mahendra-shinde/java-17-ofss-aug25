package com.mahendra.bank;

public class Transaction {
	private Account fromAccount, toAccount;
	
	// Overloaded / Paramterized Constructor
	public Transaction(Account fromAccount, Account toAccount) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}
	
	public void transfer(double amount) {
		double bal1 = fromAccount.getBalance() - amount ;
		if(bal1 <=0 ) {
			System.out.println("Not enough fund in source account!");
			return;	//Stop method execution
		}
		fromAccount.setBalance(bal1); // Update the balance 
		toAccount.setBalance(toAccount.getBalance()+amount);
		System.out.println("Transaction was successful !");
	}
}
