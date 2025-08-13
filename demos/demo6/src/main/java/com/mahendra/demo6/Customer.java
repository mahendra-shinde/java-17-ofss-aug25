package com.mahendra.demo6;

public class Customer {
	private Integer custId;
	private String firstName;
	private String lastName;
	private String phone;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Customer() {
		super();
	}
	public Customer(Integer custId, String firstName, String lastName, String phone) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	
	
}
