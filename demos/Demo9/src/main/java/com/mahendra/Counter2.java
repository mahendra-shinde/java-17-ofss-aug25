package com.mahendra;

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
		for(int i=start; i<end; i++) {
			System.out.println(name+" "+i);
		}
		return "finished with "+name;
	}

}
