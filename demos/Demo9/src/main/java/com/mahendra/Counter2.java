package com.mahendra;

import java.util.Random;
import java.util.concurrent.Callable;

public class Counter2 implements Callable<String> {
	
	private int start;
	private int end;
	private String name;
	
	public Counter2(String name,int start, int end) {
		super();
		this.name = name;
		this.start = start;
		this.end = end;
	}
	

	@Override
	public String call() throws Exception {
		int randomSpace = new Random().nextInt(20);
		for(int i=start; i<end; i++) {
			System.out.printf("%s %s %5d\n", leftPadding(randomSpace), name, i);
		}
		return "finished with "+name;
	}
	
	private String leftPadding(int size) {
		StringBuilder br = new StringBuilder("");
		for(int i=0;i<size;i++) {
			br.append(".");
		}
		return br.toString();
	}

}
