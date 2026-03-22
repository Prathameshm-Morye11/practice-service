package com.practice.stream.interview.others;

import java.util.Arrays;

public class MoveZerosToLast {

	public static void main(String[] args) {
		// Input : [5,4,0,1,2,9,0]
		// Output : [5,4,1,2,9,0,0]

		int[] arr = { 5, 4, 0, 1, 2, 9, 0 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}

		while (index < arr.length) {
			arr[index++] = 0;
		}

		System.out.println(Arrays.toString(arr));
	}
}
