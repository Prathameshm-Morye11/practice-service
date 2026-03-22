package com.practice.multithread.interval;

public class TwoAndFourSecIntervalCGPT {

	public static void main(String[] args) {

		Thread t1 = new Thread(new TwoSecInterval());
		Thread t2 = new Thread(new FourSecInterval());

		t1.start();
		t2.start();
	}
}
