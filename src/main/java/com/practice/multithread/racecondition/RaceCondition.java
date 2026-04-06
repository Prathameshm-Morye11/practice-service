package com.practice.multithread.racecondition;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {

		Counter count = new Counter();

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
