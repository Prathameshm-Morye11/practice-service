package com.practice.stream.interview.intellect;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code2 {

	public static void main(String[] args) {
		// input: ”manojpandey”
		// output: a-2,n-2

		String str = "manojpandey";

		// Scenario:1
//		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < str.length(); i++) {
//			Character c = str.charAt(i);
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
//		}
//
//		StringBuilder result = new StringBuilder();
//		for (Map.Entry<Character, Integer> m : map.entrySet()) {
//			if (m.getValue() > 1) {
//				result.append(m.getKey()).append("-").append(m.getValue()).append(",");
//			}
//		}
//
//		if (result.length() > 0) {
//			result.setLength(result.length() - 1);
//		}
//
//		System.out.println(result);

		// Scenario: 2

//		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		map.entrySet().stream().filter(i -> i.getValue() > 1)
//				.forEach(e -> System.out.print(e.getKey() + "-" + e.getValue() + ","));

		// Scenario:3
		str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() > 1)
				.forEach(e -> System.out.print(e.getKey() + "-" + e.getValue() + ","));

	}
}
