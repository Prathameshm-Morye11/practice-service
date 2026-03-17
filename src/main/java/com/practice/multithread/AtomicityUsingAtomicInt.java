package com.practice.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityUsingAtomicInt {

	AtomicInteger count = new AtomicInteger(0);

	void increment() {
		count.incrementAndGet();
	}
}
