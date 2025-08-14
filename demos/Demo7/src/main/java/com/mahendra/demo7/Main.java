package com.mahendra.demo7;

public class Main {

	public static void main(String[] args) {
		InterestCalculator calc = new InterestCalculator();
		//calc.input();
		while(true) {
		try {
			calc.input2();
			double interest = calc.calc();
			System.out.println("Interest = "+interest);
			return; // STOP APPLICATION "Gently" 
		}catch(NumberFormatException ex) {
			System.out.println("Invalid value : "+ex.getMessage());
			System.out.println("Please re-try again");
		}catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		}
		

	}

}
