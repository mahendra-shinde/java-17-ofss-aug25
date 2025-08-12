package com.mahendra.demo4;

public abstract class Account {
	private String accNum;
	private String holderName;
	private double balance;
	
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
