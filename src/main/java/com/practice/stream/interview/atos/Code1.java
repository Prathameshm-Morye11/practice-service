package com.practice.stream.interview.atos;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code1 {

	public static void main(String[] args) {
		// count the number of occurrences of characters except spaces
		String name = "Prathamesh Prakash Morye";
		String name1 = name.replaceAll(" ", "");

		// Scenario 1:
		System.out.println(name1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		// Scenario 2:
		name1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().forEach(e -> System.out.print(e.getKey() + "->" + e.getValue() + " "));

		System.out.println();

		// Scenario 3:
		Map<Character, Long> result = name.chars().filter(c -> c != ' ') // remove spaces
				.mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);
	}
}
