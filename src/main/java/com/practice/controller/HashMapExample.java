package com.practice.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashMapExample {

	// HashMap is not thread safe and will not works properly if we are typing to
	// perform multiple task at at time . In this instead of output is 500 it is
	// giving less some time to overcome this issue we can use ConcurretHashMap

	private static final int NUM_THREAD = 5;
	private static final int NUM_INSERTION = 100;

	static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executeService = Executors.newFixedThreadPool(NUM_THREAD);

		for (int i = 0; i < NUM_THREAD; i++) {
			executeService.execute(inserRecords());
		}
		executeService.shutdown();
		if (!executeService.isTerminated()) {
			Thread.sleep(1000);
		}
		System.out.println("Size of map : " + map.size());
	}

	private static Runnable inserRecords() {
		return () -> {
			for (int i = 0; i < NUM_INSERTION; i++) {
				map.put(i + Thread.currentThread().getName(), i);
			}
		};
	}
}
