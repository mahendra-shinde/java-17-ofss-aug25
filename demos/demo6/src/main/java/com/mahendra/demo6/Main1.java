package com.mahendra.demo6;

import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		// RAW Collections (Non-Generic)
		Set data1 = new HashSet();
		data1.add("Data 1");
		data1.add(23000.00);
		
		for(Object obj : data1) {
			System.out.println(obj +" is of type "+ obj.getClass().getName());
		}

		// Generic Collection (Introduced in Java 5
		// The diamond operator "<>" was introduced in Java 7
		Set<Account> data2 = new HashSet<>();
		//data2.add("Abcd");
		data2.add(new SavingAccount());
		
	}

}
