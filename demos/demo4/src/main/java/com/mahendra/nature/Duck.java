package com.mahendra.nature;

public class Duck  extends Animal implements Swimable, Flyable{
	@Override
	public void fly() {
		System.out.println("Flying duck ....");
	}
	@Override
	public void swim() {
		System.out.println("Swiming duck ....");
	}
}
