package com.mahendra;

/// Defined a "Runnable" task which could be deployed inside a THREAD 
public class Counter implements Runnable{
	private int start;
	private int end;
	private String name;
	
	public Counter(String name,int start, int end) {
		super();
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i=start; i<end; i++) {
			// Lets PAUSE the execution or slow down
//			try {
//			Thread.sleep(10); // Pause for 100ms (1/10th of one second)
//			}catch(InterruptedException ex) {
//				ex.printStackTrace();
//			}
			System.out.println(name+" "+i);
		}
	}
}
