package com.practice.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class AsyncWithReturn {

	public static void main(String[] args) {
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			return 10 + 20;
		});

		Integer result = future.join();
		System.out.println("Result : " + result);
	}
}
