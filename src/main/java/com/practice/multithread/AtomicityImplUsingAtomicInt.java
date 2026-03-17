package com.practice.multithread;

public class AtomicityImplUsingAtomicInt {

	public static void main(String[] args) throws InterruptedException {

		AtomicityUsingAtomicInt count = new AtomicityUsingAtomicInt();

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
