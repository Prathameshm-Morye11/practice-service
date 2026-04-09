package com.practice.stream.interview.wissen;

import java.util.Arrays;

public class Test4 {
	public static void main(String[] args) {

		// On Stage Performance Arrangement
		// input={1,2,3,4,5,6,7};
		// output={2,1,4,3,6,5,7};

//		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr = { -8, -7, -4, -3, 1 };
		int n = 5;

		for (int i = 0; i < n - 1; i += 2) {
			swap(arr, i, i + 1);
		}

		System.out.println("Arranged Performers :" + Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
