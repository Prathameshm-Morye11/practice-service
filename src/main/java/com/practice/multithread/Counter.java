package com.practice.multithread;

public class Counter {

	volatile int count = 1;

	void increment() {
		count++;
	}
}
