package com.mahendra.demo4;

public interface Transaction {

	boolean isActive();
	boolean hasFunds(Double amt);
	
}
