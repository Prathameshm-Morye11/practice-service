package com.practice.multithread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {

		ExecutorService execute = Executors.newFixedThreadPool(2);

		for (int i = 1; i <= 10; i++) {
			int taskId = i;
			execute.submit(() -> {
				System.out.println("Executing task: " + taskId + " : " + Thread.currentThread().getName());
			});
		}

		execute.shutdown();
	}
}
