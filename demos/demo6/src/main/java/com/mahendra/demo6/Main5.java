package com.mahendra.demo6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Customer> customers = new LinkedList<>();
		customers.add(new Customer(1001, "Riddly", "Scott", "2347567"));
		customers.add(new Customer(1002, "Tom", "Scott", "2347563"));
		customers.add(new Customer(1003, "Justien", "Bibber", "2347333"));
		customers.add(new Customer(1004, "Daddy", "Yanki", "2227567"));
		customers.add(new Customer(1005, "Shakira", "A.", "2347522"));

		Collections.sort(customers, (a, b) -> a.getFirstName().compareTo(b.getFirstName()));
		customers.forEach(Main5::print);
	}

	static void print(Customer c) {
		System.out.printf("| %20s %20s | %12s\n", c.getFirstName(), c.getLastName(), c.getPhone());
	}
}
