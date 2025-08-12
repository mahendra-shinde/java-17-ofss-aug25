package com.mahendra.nature;

public class Fish extends Animal implements Swimable{
	@Override
	public void swim() {
		System.out.println("... Swiming fish ......");
	}
}
