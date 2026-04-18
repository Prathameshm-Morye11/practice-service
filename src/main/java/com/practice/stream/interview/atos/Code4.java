package com.practice.stream.interview.atos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code4 {

	public static void main(String[] args) {

		// find the occurrence of each character
		// Scenario 1:
		List<String> str = Arrays.asList("This is java Program", "This is c Program", "This is cobol Program");
		String combineStr = "";
		for (String st : str) {
			combineStr += st;
		}

		combineStr = combineStr.replaceAll(" ", "");

		combineStr.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

		// Scenario 2:
		str.stream().flatMap(s -> s.chars().mapToObj(c -> (char) c)).filter(c -> c != ' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}
}
