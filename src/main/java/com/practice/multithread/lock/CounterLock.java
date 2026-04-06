package com.practice.multithread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

	ReentrantLock lock = new ReentrantLock();
	int count = 0;

	public void increment() {
		try {
			lock.lock();
			count++;
		} finally {
			lock.unlock();
		}
	}

	public int totalCount() {
		return count;
	}
}
