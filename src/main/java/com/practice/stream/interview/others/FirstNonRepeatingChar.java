package com.practice.stream.interview.others;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "cadacdeabcafg";

		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey());
	}
}
