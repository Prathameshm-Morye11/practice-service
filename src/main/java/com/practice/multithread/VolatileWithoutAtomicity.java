package com.practice.multithread;

public class VolatileWithoutAtomicity {

	public static void main(String[] args) throws InterruptedException {

		Counter count = new Counter();

		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
				count.increment();
			}
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(count.count);
	}
}
