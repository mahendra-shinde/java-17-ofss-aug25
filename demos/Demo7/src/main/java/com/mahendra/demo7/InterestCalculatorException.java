package com.mahendra.demo7;

//A User defined exception is 'concrete' "Java class" which must inherite another existing
// Exception class.
public class InterestCalculatorException extends RuntimeException {

	private Integer minValue;
	private Integer maxValue;
	
	public InterestCalculatorException(Integer minValue, Integer maxValue) {
		super("Value must be in range: "+minValue + " - "+maxValue);
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
		
	
}
