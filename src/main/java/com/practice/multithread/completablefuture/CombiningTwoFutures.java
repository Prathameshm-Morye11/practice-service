package com.practice.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CombiningTwoFutures {

	public static void main(String[] args) {
		CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
		CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);

		CompletableFuture<Integer> future = f1.thenCombine(f2, (a, b) -> a + b);
		System.out.println(future.join());
	}
}
