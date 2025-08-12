package com.mahendra.bank;

public class Main4 {

	public static void main(String[] args) {
		Account acc1 = new SavingAccount();
		acc1.setAccNum("SB234234");
		acc1.setBalance(23880.00);
		acc1.setHolderName("Rajiv Bhatia");
		
		Account acc2 = new CurrentAccount();
		acc2.setAccNum("CA3246283746");
		acc2.setHolderName("Tamanna Bhatia");
		acc2.setBalance(230000.45);
		
		Transaction t1 = new Transaction(acc1, acc2);
		t1.transfer(2000);
		
		System.out.println("Balance post transaction....");
		System.out.println(acc1.getHolderName()+"  has Rs "+acc1.getBalance());
		System.out.println(acc2.getHolderName()+"  has Rs "+acc2.getBalance());
	}

}
