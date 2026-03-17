package com.practice.multithread;

public class WithoutVolatile {

	public static void main(String[] args) {

		SharedData sharedData = new SharedData();

		Thread t1 = new Thread(() -> {
			System.out.println("Thread 1: Waiting for the thread to flag becomes true");
			while (!sharedData.flag) {

			}
			System.out.println("Thread 1: Flag is changed to true");
		});

		Thread t2 = new Thread(() -> {
			System.out.println("Thread 2: Waiting for the thread to flag becomes true");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sharedData.flag = true;
			System.out.println("Thread 2:Flag is changed to true");
		});

		t1.start();
		t2.start();
	}
}
