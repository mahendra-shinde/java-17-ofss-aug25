package com.mahendra.demo6;

import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<Account> account2 = new LinkedList<Account>();
		account2.add(new SavingAccount("SB6376387","Urmila Matondkar",5400.00));
		account2.add(new SavingAccount("SB6376117","Sonali Bendre",5300.00));
		account2.add(new SavingAccount("SB6322447","Sonali Shinde",52220.00));
		account2.add(new SavingAccount("Sb3648762","Kamala Harris",467363.65));
		account2.add(new SavingAccount("SB3467482","Donald Trump",5640999.89));
		account2.add(new SavingAccount("SB2346428","Hulk Hogan",3340000));
		System.out.println("Data from LIST !!");
		//Labmda Expression
		account2.forEach( (a) -> System.out.println(a.getHolderName()+" "+a.getBalance()) );
		// Alternate method is (Method References)
		account2.forEach(Main3::printNameAndBalance);
	}
	
	public static void printNameAndBalance(Account acc) {
		System.out.println(acc.getHolderName()+" "+acc.getBalance());
	}

}
