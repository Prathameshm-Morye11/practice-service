package com.practice.multithread.reentranctlock;

public class ReentrantLockDemo {

	public static void main(String[] args) throws InterruptedException {

		Counter count = new Counter();

		Runnable task = () -> {
			for (int i = 0; i < 100; i++) {
				count.increament();
			}
		};

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Total numbers of time lock happed : " + count.getCount());

	}
}
