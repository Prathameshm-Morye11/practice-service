package com.practice.multithread.racecondition;

public class Counter {

	static int count = 1;

	public int increment() {
		return count++;
	}

	public int totalCount() {
		return count;
	}
}
