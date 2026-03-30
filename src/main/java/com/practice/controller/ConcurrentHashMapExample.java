package com.practice.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapExample {

	private static final int NUM_THREAD = 5;
	private static final int NUM_INSERTION = 100;

	static Map<String, Integer> map = new ConcurrentHashMap<>();

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
