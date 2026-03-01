package com.practice.multithread;

public class evenOddNumbersUsingThread implements Runnable {

	static int count = 1;
	Object object;

	public evenOddNumbersUsingThread(Object object) {
		this.object = object;
	}

	public static void main(String[] args) {

		Object object = new Object();
		Runnable r1 = new evenOddNumbersUsingThread(object);
		Runnable r2 = new evenOddNumbersUsingThread(object);

		new Thread(r1, "odd").start();
		new Thread(r2, "even").start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (count <= 10) {
			if (count % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("odd")) {
				synchronized (object) {
					System.out.println("Thread " + Thread.currentThread().getName() + " : " + count);
					count++;
					object.notify();
				}
			}

			if (count % 2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("even")) {
				synchronized (object) {
					System.out.println("Thread " + Thread.currentThread().getName() + " : " + count);
					count++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
