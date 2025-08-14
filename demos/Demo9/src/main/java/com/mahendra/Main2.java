package com.mahendra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		Counter2 c1 = new Counter2("Donald", 10, 100);
		Counter2 c2 = new Counter2("Biden",10,100);
		Counter2 c3 = new Counter2("Narendra",10,100);
		Counter2 c4 = new Counter2("Putin", 10, 100);
		service.submit(c1);
		service.submit(c2);
		service.submit(c3);
		service.submit(c4);
		
		try {
			//wait for 1 minute
			Thread.sleep(1000);
			//Then try shutting down all calls (threads)
			service.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
