package com.mahendra.demo6;

import java.util.HashMap;
import java.util.Map;

public class CustomerDAO {
	private static int LAST_ID = 0;
	private Map<Integer, Customer>customers = new HashMap<>();
	
	public CustomerDAO() {
		
	}
	
	
	// create a new Customer object, add it to MAP "customers" and return new ID
	public int create(String firstName, String lastName, String phone) {
		int newId = LAST_ID ++;
		Customer cust = new Customer(newId, firstName, lastName, phone);
		customers.put(newId, cust);
		return newId;
	}
	
	public Customer findOne(int custId) {
		return customers.get(custId);
			
	}
	
	public void updateFirstName(int custId, String newFirstName) {
		Customer cust = findOne(custId);
		if(cust==null) {
			cust.setFirstName(newFirstName);
		}
	}
	//find by firstName, lastName and phone
	
	
	
}
