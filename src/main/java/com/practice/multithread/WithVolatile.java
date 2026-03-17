package com.practice.multithread;

public class WithVolatile {

	public static void main(String[] args) {

		SharedDataWithVolatile shDataWithVolatile = new SharedDataWithVolatile();
		new Thread(() -> {

			System.out.println("Thread 1: Waiting for the thread to flag becomes true");
			while (!shDataWithVolatile.flag) {

			}
			System.out.println("Thread 1: Flag is changed to true");
		}).start();

		new Thread(() -> {
			System.out.println("Thread 2: Waiting for the thread to flag becomes true");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			shDataWithVolatile.flag = true;
			System.out.println("Thread 2: Flag is changed to true");
		}).start();
	}
}
