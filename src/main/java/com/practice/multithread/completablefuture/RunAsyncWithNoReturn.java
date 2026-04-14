package com.practice.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class RunAsyncWithNoReturn {

	public static void main(String[] args) {
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			System.out.println("Running async Task....");
		});

		future.join();
		System.out.println("Done");
	}
}
