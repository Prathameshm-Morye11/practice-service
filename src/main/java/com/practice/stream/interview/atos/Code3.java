package com.practice.stream.interview.atos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Code3 {

	public static void main(String[] args) {

		// find the second largest integer without sorting the array (output = 55)
		// scenario 1:
		int[] arr = { 7, 2, 55, 90, 23, 54 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("Second value in not present");
		} else {
			System.out.println("Scenario 1: " + second);
		}

		// Scenario 2:
		// Using Stream
		int secondLargest = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).skip(1).findFirst().get();

		System.out.println("Scenario 2: " + secondLargest);

		// scenario 3:

		List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Integer result = lst.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Scenario 3: " + result);
	}
}
