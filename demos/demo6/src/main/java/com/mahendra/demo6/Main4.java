package com.mahendra.demo6;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<Account> account2 = new LinkedList<Account>();
		account2.add(new SavingAccount("SB6376387", "Urmila Matondkar", 5400.00));
		account2.add(new SavingAccount("SB6376117", "Sonali Bendre", 5300.00));
		account2.add(new SavingAccount("SB6322447", "Sonali Shinde", 52220.00));
		account2.add(new SavingAccount("Sb3648762", "Kamala Harris", 467363.65));
		account2.add(new SavingAccount("SB3467482", "Donald Trump", 5640999.89));
		account2.add(new SavingAccount("SB2346428", "Hulk Hogan", 3340000));

		Collections.sort(account2, new SortByBalance());
		
		//System.out.println("All the accounts sorted by their balance: ");
		//account2.forEach(Main4::print);
		
		//Collections.sort(account2, (a,b) -> a.getBalance().compareTo(b.getBalance())  );
		
		account2.stream().filter( a ->  a.getBalance() > 100000D  ).forEach(Main4::print);
		
		//Method reference would work only if
		// 1. Method is static and returns VOID
		// 2. Method takes ONLY one argument who's type matches with Element-type of collection "account2" 
		
		for(Account a : account2) {
			if(a.getBalance() > 100000D) {
				Main4.print(a);
			}
		}
	}
	
	static void print(Account a) {
		System.out.printf("| %25s | %10s | %12.3f\n",a.getHolderName(), a.getAccNum(), a.getBalance());
	}

	//A Single use "Inner" Java class
	static class SortByBalance implements Comparator<Account> {
		public int compare(Account o1, Account o2) {
			return o1.getBalance().compareTo(o2.getBalance());
		}
	}

}
