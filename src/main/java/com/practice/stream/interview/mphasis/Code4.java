package com.practice.stream.interview.mphasis;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Code4 {

	public static void main(String[] args) {
		// print the distinct values and order should be maintain

		// Scenario:1
		List<Integer> lst = Arrays.asList(4, 5, 6, 62, 1, 2, 3, 4);
		List<Integer> result = lst.stream().distinct().collect(Collectors.toList());
		System.out.println(result);

		// Scenario:2
		Set<Integer> result2 = new LinkedHashSet<>(lst);
		System.out.println(result2);
	}
}
