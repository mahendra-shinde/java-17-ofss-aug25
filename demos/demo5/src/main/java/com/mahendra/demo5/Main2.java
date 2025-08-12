package com.mahendra.demo5;

public class Main2 {

	public static void main(String[] args) {
		Bank xyzBank = new Bank();
		
		xyzBank.createAccount(new Account("", "John",AccountType.SAVINGS , 120000D));
		xyzBank.createAccount(new Account("", "Amar",AccountType.SAVINGS , 1893300D));
		xyzBank.createAccount(new Account("", "Deepika",AccountType.CURRENT , 8720000D));
		
		Account ac = xyzBank.find("SB0001");
		if(ac!=null) {
			System.out.println("Account found: ");
			System.out.println("Acc Number: "+ac.getAccNum());
			System.out.println("Holder name: "+ac.getHolderName());
		}
		
		xyzBank.listAll();
		

	}

}
