package com.mahendra.demo5;

public class Bank {
	private Account[] accounts = new Account[100];
	private static int CURRENT_ACCNU=0;
	
	public void createAccount(Account acc) {
		if(CURRENT_ACCNU >= 100) {
			System.out.println("Maximum limit reached, cannot add any new accounts !");
		}else {
			accounts[CURRENT_ACCNU] = acc;
			acc.setAccNum("SB000"+ ++CURRENT_ACCNU);
		}
	}
	
	public Account find(String accNum) {
		for(int i=0; i< CURRENT_ACCNU; i++) {
			Account tmp = accounts[i];
			if(tmp.getAccNum().equalsIgnoreCase(accNum)) {
				return tmp;
			}
		}
		return null;
	}
	
	public double checkBalance(String accNum) {
		Account acc = find(accNum);
		if(acc==null) {
			System.out.println("No account found!");
			return 0;
		}else {
			return acc.getBalance();
		}
	}
	
	public void listAll() {
		System.out.println("+-----------------------------------------+");
		System.out.println("|      List of Accounts                   |");
		System.out.println("+-----------------------------------------+");

		for(int i=0; i< CURRENT_ACCNU; i++) {
			Account tmp=accounts[i];
			System.out.printf("| %8s | %-15s | %10.2f |	\n",tmp.getAccNum(), tmp.getHolderName(), tmp.getBalance());
		}
		System.out.println("+-----------------------------------------+");
	}
}
