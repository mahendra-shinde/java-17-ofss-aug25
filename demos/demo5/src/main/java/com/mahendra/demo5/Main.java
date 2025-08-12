package com.mahendra.demo5;

import static com.mahendra.demo5.AccountType.*;

public class Main {

	public static void main(String[] args) {
		Account acc1 = new Account("CB136447", "Vishal Devgn", CURRENT, 12300.50);
		Account acc2 = new Account("SB3873t4", "Kajol Mukharjee", SAVINGS, 123000.00);
	}
}
