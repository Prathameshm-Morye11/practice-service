package com.practice.stream.interview.intellect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code1 {

	public static void main(String[] args) {
		// Input : [5,4,0,1,2,9,0]
		// Output : [1,2,4,5,9,0,0]

		List<Integer> lst = Arrays.asList(5, 4, 0, 1, 2, 9, 0);
		List<Integer> sortedLst = lst.stream().sorted().collect(Collectors.toList());
		int index = 0;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < sortedLst.size(); i++) {
			if (sortedLst.get(i) == 0) {
				index++;
			} else {
				result.add(sortedLst.get(i));
			}
		}

		while (index > 0) {
			result.add(0);
			index--;
		}
		System.out.println(result);
	}
}
