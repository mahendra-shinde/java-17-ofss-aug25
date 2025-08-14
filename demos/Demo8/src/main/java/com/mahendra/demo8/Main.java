package com.mahendra.demo8;

import java.net.URL;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAO();
		dao.readData();
		List<Customer> customers = dao.getCustomers();
		for(Customer cust : customers) {
			System.out.println(cust);
		}
	}

}
