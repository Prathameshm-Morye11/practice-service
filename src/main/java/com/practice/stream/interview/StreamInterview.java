package com.practice.stream.interview;

import java.util.Arrays;

public class StreamInterview {

	public static void main(String[] args) {
		// 1. Fetch values from array which start with 1
		int[] arr1 = { 10, 15, 56, 43, 17, 90 };
		int[] result = Arrays.stream(arr1).filter(i -> String.valueOf(i).startsWith("1")).toArray();
		System.out.println(Arrays.toString(result));
	}

}
