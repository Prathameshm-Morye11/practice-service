package com.practice.multithread.reentranctlock;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private final ReentrantLock lock = new ReentrantLock();

	private int count = 0;

	public void increament() {
		try {
			lock.lock();
			count++;
		} finally {
			lock.unlock();
		}
	}

	public int getCount() {
		return count;
	}
}
