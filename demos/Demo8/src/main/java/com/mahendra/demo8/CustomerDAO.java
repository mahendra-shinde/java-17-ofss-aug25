package com.mahendra.demo8;

import java.io.*;
import java.util.*;


public class CustomerDAO {
	private static final String FILENAME="/customers.csv" ;
	List<Customer> customers = new LinkedList<>();
	
	public void readData(){
		String line = null;
		BufferedReader reader = null;
		try {
		 reader = new BufferedReader(new InputStreamReader(CustomerDAO.class.getResourceAsStream(FILENAME)));
		 line = reader.readLine();
		 System.out.println("Header line: "+line);
		 line = reader.readLine();
		 customers.clear(); /// Make sure list is EMPTY
		 do {
		 String[] fields = line.split(",");
		 Customer cust = CustomerDAO.extractFields(fields);
		 customers.add(cust);
		 line = reader.readLine();
		 }while(line!=null);
		 
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
			reader.close();
			}catch(IOException ex) {}
		}
		
	}
	private static Customer extractFields(String fields[]) {
		int custId = Integer.parseInt(fields[0].trim());
		String firstName = fields[1].trim();
		String lastName = fields[2].trim();
		String phone = fields[3].trim();
		return new Customer(custId, firstName, lastName, phone);
	}
	private static String convertFields(Customer cust) {
		return cust.custId()+", "+cust.firstName()+", "+cust.lastName()+", "+cust.phone()+"\n";
	}
	
	public void writeData() {
		// 1. Use BufferedWriter which should wrap another IO class "OutputStreamReader" 
		// 2. Write the header "CusId, firstName, lastName, phone" using println method of BufferedWriter
		// 3. Using for loop read all the "Customer" object 
		//4 . Convert each customer object to "String" by calling "convertFields" method
		//5. write the string to file
		//6. close the stream
	}
	
	public List<Customer> getCustomers(){
		return this.customers;
	}
}
