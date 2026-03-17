package com.practice.multithread;

public class AtomicityUsingSync {

	int count = 1;

	synchronized void increment() {
		count++;
	}
}
