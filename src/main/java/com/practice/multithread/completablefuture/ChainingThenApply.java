package com.practice.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ChainingThenApply {

	public static void main(String[] args) {

		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10).thenApply(x -> x * 2)
				.thenApply(x -> x + 5);

		System.out.println(future.join());
	}
}
