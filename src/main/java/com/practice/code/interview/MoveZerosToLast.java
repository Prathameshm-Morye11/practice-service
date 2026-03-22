package com.practice.code.interview;

import java.util.Arrays;

public class MoveZerosToLast {

	public static void main(String[] args) {

		int[] arrayInput = { 2, 0, 1, 4, 0, 0, 21, 0, 0, 1, 6, 5 };
		int index = 0;

		// 1. Two pointer-approch
		for (int i = 0; i < arrayInput.length; i++) {
			if (arrayInput[i] != 0) {
				arrayInput[index++] = arrayInput[i];
			}
		}

		while (index < arrayInput.length) {
			arrayInput[index++] = 0;
		}

		System.out.println(Arrays.toString(arrayInput));
	}
}
