package com.mahendra.demo6;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Set<Account> accounts = new HashSet<>();
		accounts.add(new SavingAccount("SB193734","Ravi Kishan",45000));
		accounts.add(new SavingAccount("SB367426","Rajiv Bhatia",452332.43));
		accounts.add(new SavingAccount("SB348744","Gaurang Chakroborti",54000.44));
		System.out.println("Data from SET  !!");
		for(Account a : accounts) {
			System.out.printf("| %25s | %10s | %12.3f\n",a.getHolderName(), a.getAccNum(), a.getBalance());
		}
		
		List<Account> account2 = new LinkedList<Account>();
		account2.add(new SavingAccount("SB6376387","Urmila Matondkar",54500.00));
		account2.add(new SavingAccount("SB6376117","Sonali Bendre",53500.00));
		account2.add(new SavingAccount("SB6322447","Mahendra Shinde",52220.00));
		System.out.println("Data from LIST !!");
		for(Account a : account2) {
			System.out.printf("| %25s | %10s | %12.3f\n",a.getHolderName(), a.getAccNum(), a.getBalance());
		}
		
		System.out.println("Last Element from List !");
		Account lastAcc = account2.get(account2.size()-1);
			
		System.out.printf("| %25s | %10s | %12.3f\n",lastAcc.getHolderName(), lastAcc.getAccNum(), lastAcc.getBalance());
		
	}

}
