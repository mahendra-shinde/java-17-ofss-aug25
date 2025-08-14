package com.mahendra.demo7;

import java.util.Scanner;

public class InterestCalculator {

	private Double principal;
	private Double rateOfInterest;
	private int duration;
	
	public InterestCalculator() {
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		String temp = null;
		System.out.println("Enter principal amount :");
		
		try {
		temp = sc.nextLine();
		principal = Double.parseDouble(temp);
		}catch(NumberFormatException ex) {
			System.out.println("The principal you entered is wrong ! ");
			System.out.println("The default principal :10,000");
			principal = 10000D;
		}
		
		System.out.println("Enter rate of interest :");
		
		try {
		temp = sc.nextLine();
		rateOfInterest = Double.parseDouble(temp);
		}catch(NumberFormatException ex) {
			System.out.println("The rate of Interest entered is invalid");
			System.out.println("Default rate of interest is 10%");
			rateOfInterest = 10D;
		}
		
		System.out.println("Enter duration in months: ");
		temp = sc.nextLine();
		
		duration = Integer.parseInt(temp);
	}
	
	public void input2()throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		String temp = null;
		System.out.println("Enter principal amount :");
		temp = sc.nextLine();
		principal = Double.parseDouble(temp);
		
		if(principal < 10000 || principal > 10000000) {
			throw new InterestCalculatorException(10000, 10000000);
		}
		
		System.out.println("Enter rate of interest :");
		temp = sc.nextLine();
		rateOfInterest = Double.parseDouble(temp);
		
		if(rateOfInterest < 3 || rateOfInterest > 20 )
			throw new InterestCalculatorException(3, 20);
		
		System.out.println("Enter duration in months: ");
		temp = sc.nextLine();
		duration = Integer.parseInt(temp);
		
		if(duration < 6 || duration > 120 )
			throw new InterestCalculatorException(6, 120);
	}
	
	
	
	public double calc() {
		return (principal * (rateOfInterest/100/12) * duration);
	}
}
