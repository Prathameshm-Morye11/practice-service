package com.practice.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionHandling {

	public static void main(String[] args) {

		// Scenario 1:
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10 / 0).handle((res, ex) -> {
			if (ex != null) {
				System.out.println("Error : " + ex.getMessage());
				return 0;
			}
			return res;
		});

		System.out.println(future1.join());

		// Scenario 2:
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 10 / 0).exceptionally(ex -> {
			System.out.println("Exception Occurred");
			return -1;
		});

		System.out.println(future2.join());
	}
}
