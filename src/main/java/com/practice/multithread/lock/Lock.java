package com.practice.multithread.lock;

public class Lock {

	public static void main(String[] args) throws InterruptedException {
		CounterLock count = new CounterLock();

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				count.increment();
			}
		};

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Total count : " + count.totalCount());
	}
}
