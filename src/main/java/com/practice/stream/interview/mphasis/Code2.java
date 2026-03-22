package com.practice.stream.interview.mphasis;

import java.util.HashSet;

public class Code2 {

	// 2. Find the longest string having non-repeating characters from the input
	// input="javaconceptoftheday";
	// output="oftheday"

	// Scenario:1
//	public static void main(String[] args) {
//		String str = "javaconceptoftheday";
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			String temp = "";
//			for (int j = i; j < str.length(); j++) {
//				String c = str.charAt(j) + "";
//				if (temp.contains(c)) {
//					break;
//				} else {
//					temp = temp + c;
//				}
//			}
//			if (temp.length() > result.length()) {
//				result = temp;
//			}
//		}
//
//		System.out.println(result);
//	}

	
	// Scenario:2
	public static void main(String[] args) {
		String str = "javaconceptoftheday";
		HashSet<Character> set = new HashSet<>();
		int left = 0;
		int maxLength = 0;
		int start = 0;

		for (int right = 0; right < str.length(); right++) {
			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(str.charAt(right));
			if (right - left + 1 > maxLength) {
				maxLength = right - left + 1;
				start = left;
			}
		}

		String result = str.substring(start, start + maxLength);
		System.out.println(result);
	}

}
