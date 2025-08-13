package com.mahendra.demo6;


public abstract class Account {
	private String accNum;
	private String holderName;
	private double balance;
	
	public Account() {
	}
	
	public Account(String accNum, String holderName, double balance) {
		super();
		this.accNum = accNum;
		this.holderName = holderName;
		this.balance = balance;
	}




	//Accessor (Getters)
	public String getAccNum() {
		return this.accNum;
	}
	//Mutator (Setters)
	public void setAccNum(String accNum) {
		this.accNum=accNum;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
