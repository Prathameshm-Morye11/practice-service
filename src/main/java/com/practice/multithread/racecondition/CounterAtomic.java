package com.practice.multithread.racecondition;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {

	AtomicInteger count = new AtomicInteger(0);

	public int increment() {
		return count.getAndIncrement();
	}

	public int totalCount() {
		return count.get();
	}

}
