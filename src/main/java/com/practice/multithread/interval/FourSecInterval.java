package com.practice.multithread.interval;

public class FourSecInterval implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 1; j <= 5; j++) {
			System.out.println("Thread-4sec: " + j);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
