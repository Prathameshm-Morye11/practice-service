package com.practice.stream.interview.others;

import java.util.Arrays;
import java.util.List;

public class Others {

	public static void main(String[] args) {

		// flatmap
		List<List<Integer>> lst = Arrays.asList(List.of(3, 56, 67), List.of(98, 90, 21));

		lst.stream().map(l -> l.stream()).forEach(System.out::println);
		lst.stream().flatMap(l -> l.stream()).forEach(System.out::println);

	}
}
