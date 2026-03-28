package com.practice.stream.interview.intellect;

public class Code3 {

	public static void main(String[] args) {

		// Find the lowest number
		int[] arr = { 4, 6, 1, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(arr[0]);
	}
}
