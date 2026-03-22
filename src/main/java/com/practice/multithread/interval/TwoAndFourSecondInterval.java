package com.practice.multithread.interval;

public class TwoAndFourSecondInterval implements Runnable {

	static int count = 1;
	Object object;

	TwoAndFourSecondInterval(Object object) {
		this.object = object;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (count <= 10) {
			if (count % 2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("first")) {
				synchronized (object) {
					System.out.println(Thread.currentThread().getName() + " : " + count);
					count++;
					try {
						Thread.sleep(2000);
						object.notify();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			if (count % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("second")) {
				synchronized (object) {
					System.out.println(Thread.currentThread().getName() + " : " + count);
					count++;
					try {
						Thread.sleep(4000);
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		Object object = new Object();
		Runnable r1 = new TwoAndFourSecondInterval(object);
		Runnable r2 = new TwoAndFourSecondInterval(object);

		new Thread(r1, "first").start();
		new Thread(r2, "second").start();

	}

}
