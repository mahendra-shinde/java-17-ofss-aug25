package com.mahendra.demo4;

public class CurrentAccount extends Account implements Transaction{
	
	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean hasFunds(Double amt) {
		return this.getBalance() > amt ;
	}

	public void withdraw(double amount) {
		if(this.isActive() && this.hasFunds(amount)) {
			this.setBalance(this.getBalance()-amount);
			System.out.println("Withdrawal was successful !");
		}
	}
	
	public void deposit(double amount) {
		if(this.isActive()) {
			this.setBalance(this.getBalance()+amount);
			System.out.println("Deposit was successful !");
		}
	}
}
