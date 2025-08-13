package com.mahendra.demo2;

public class Main1 {

	public static void main(String[] args) {
		Address address = new Address("House No 123", "Sector 122", "Noida", "2323686");
		String line1 = address.line1();
		System.out.println(address.toString());
		//Address add2 = new Address();
	}

}
