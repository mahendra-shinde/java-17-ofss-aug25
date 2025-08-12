package com.mahendra.demo5;

public class Account {
	private String accNum;
	private String holderName;
	private AccountType type;
	private Double balance;
	
	public Account(String accNum, String holderName, AccountType type, Double balance) {
		super();
		this.accNum = accNum;
		this.holderName = holderName;
		this.type = type;
		this.balance = balance;
	}
	
	public String getAccNum() {
		return accNum;
	}
	public String getHolderName() {
		return holderName;
	}
	public AccountType getType() {
		return type;
	}
	public Double getBalance() {
		return balance;
	}
	
	
	
	
}
