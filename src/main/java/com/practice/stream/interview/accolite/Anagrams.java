package com.practice.stream.interview.accolite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {

	public static void main(String[] args) {

//		Given a list of strings, find and group all anagrams into separate lists.
//		Example: List<String> anaList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
//		Expected Output: {eat, tea, ate}, {tan, nat}, {bat}

		// Scenario 1:

		System.out.println("Scenario 1 : ");
		List<String> anaList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < anaList.size(); i++) {
			String str = anaList.get(i);
			String sortedStr = Arrays.stream(str.split("")).sorted().collect(Collectors.joining(""));
			if (map.containsKey(sortedStr)) {
				List<String> lst = map.get(sortedStr);
				lst.add(str);
				map.put(sortedStr, lst);
			} else {
				List<String> newList = new ArrayList<>();
				newList.add(str);
				map.put(sortedStr, newList);
			}
		}

		for (Map.Entry<String, List<String>> m : map.entrySet()) {
			System.out.println(m.getValue());
		}

		System.out.println();
		System.out.println("Scenario 2 : ");

		// Scenario 2 :

		anaList.stream().collect(Collectors.groupingBy(
				str -> str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining())))
				.values().forEach(System.out::println);
		;
	}
}
