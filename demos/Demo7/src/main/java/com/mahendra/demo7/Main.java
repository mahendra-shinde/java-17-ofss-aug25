package com.mahendra.demo7;

public class Main {

	public static void main(String[] args) {
		InterestCalculator calc = new InterestCalculator();
		calc.input();
		double interest = calc.calc();
		System.out.println("Interest = "+interest);
	}

}
