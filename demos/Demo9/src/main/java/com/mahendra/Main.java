package com.mahendra;

public class Main {
 public static void main(String[] args) {
	Counter counter1 = new Counter("Donald",10,1000);
	Counter counter2 = new Counter("Biden", 10, 1000);
	
	Thread t1 = new Thread(counter1);
	Thread t2 = new Thread(counter2);
	
	System.out.println("Current thread count : " + Thread.activeCount() );
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();	// Start executing t1 thread
	t2.start();
}
}
