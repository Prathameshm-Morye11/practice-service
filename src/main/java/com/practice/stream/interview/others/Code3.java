package com.practice.stream.interview.others;

import java.util.Arrays;

public class Code3 {

	public static void main(String[] args) {

		// input: [1,2,3,4]
		// output: [24,12,8,6]

		int num[] = { 1, 2, 3, 4 };
		int n = num.length;
		int answer[] = new int[n];
		answer[0] = 1;
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] * num[i - 1];
		}

		int suffix = 1;
		for (int j = n - 1; j >= 0; j--) {
			answer[j] = answer[j] * suffix;
			suffix = num[j] * suffix;
		}

		System.out.println(Arrays.toString(answer));
	}
}
