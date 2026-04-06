package com.practice.multithread.racecondition;

public class ReceConditionResolved {

	public static void main(String[] args) throws InterruptedException {

		CounterAtomic count = new CounterAtomic();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				count.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int j = 0; j < 1000; j++) {
				count.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Total count: " + count.totalCount());

	}
}
