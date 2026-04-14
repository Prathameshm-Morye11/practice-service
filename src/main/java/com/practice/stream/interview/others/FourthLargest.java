package com.practice.stream.interview.others;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FourthLargest {

	public static void main(String[] args) {
		List<Integer> lstInt = Arrays.asList(1, 2, 6, 7, 8, 9, 10, 3, 4, 5);

		System.out.println(lstInt.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().get());
	}
}
