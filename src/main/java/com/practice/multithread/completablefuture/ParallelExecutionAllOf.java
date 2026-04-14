package com.practice.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ParallelExecutionAllOf {

	public static void main(String[] args) {
		CompletableFuture<Void> f1 = CompletableFuture.runAsync(() -> {
			System.out.println("Task 1");
		});

		CompletableFuture<Void> f2 = CompletableFuture.runAsync(() -> {
			System.out.println("Task 2");
		});

		CompletableFuture<Void> future = CompletableFuture.allOf(f1, f2);

		future.join();
		System.out.println("All Tasks are completed");
	}
}
