package com.practice.stream.interview.wissen;

public class Test5 {

	public static void main(String[] args) {
		// Delivery Route Optimization
		// input={2,2,5,6,-2};
		// output=3

		int[] arr = { 2, 2, 5, 6, -2 };
		int n = 5;

		int result = optimizedRoute(arr, n);
		System.out.println(result);
	}

	private static int optimizedRoute(int[] arr, int n) {

		int totalSum = 0;
		for (int distance : arr) {
			totalSum += distance;
		}
		int leftSum = 0;
		for (int i = 0; i < n; i++) {
			if (leftSum == totalSum - leftSum - arr[i]) {
				return i + 1;
			}
			leftSum += arr[i];
		}
		return -1;
	}
}
