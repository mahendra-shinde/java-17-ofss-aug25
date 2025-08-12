package com.mahendra.demo3;

public class Greeting {
	// Not visible to others but visible to Inherited classes 
	protected String message;
	
	public Greeting() {
		message = "Good morning, ";
	}
	
	public void greet(String name) {
		//Private members are ACCESSIBLE within SAME class
		System.out.println( message+" "+name );
	}
}
