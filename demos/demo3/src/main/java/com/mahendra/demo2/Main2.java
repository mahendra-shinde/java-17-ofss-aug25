package com.mahendra.demo2;

import com.mahendra.demo3.Greeting;
import com.mahendra.demo3.SpanishGreeting;

public class Main2 {

	public static void main(String[] args) {
		//Greeting gt = new Greeting();
		// Polymorphism !
		Greeting gt = new SpanishGreeting();
		gt.greet("Mahendra");
	}

}
