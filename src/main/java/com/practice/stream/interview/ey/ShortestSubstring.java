package com.practice.stream.interview.ey;

import java.util.HashSet;
import java.util.Set;

public class ShortestSubstring {

	public static void main(String[] args) {

		String s = "xyzabccpqr";
		System.out.println(findShortestSubstring(s)); // Output: 3
	}

	public static int findShortestSubstring(String s) {
		int n = s.length();

		// If already unique
		if (allUnique(s))
			return 0;

		int ans = n;

		for (int i = 0; i < n; i++) {
			Set<Character> leftSet = new HashSet<>();

			// Build left part [0..i-1]
			boolean validLeft = true;
			for (int x = 0; x < i; x++) {
				if (!leftSet.add(s.charAt(x))) {
					validLeft = false;
					break;
				}
			}

			if (!validLeft)
				continue;

			Set<Character> combined = new HashSet<>(leftSet);

			for (int j = n; j >= i; j--) {
				combined = new HashSet<>(leftSet);
				boolean valid = true;

				// Add right part [j..n-1]
				for (int x = j; x < n; x++) {
					if (!combined.add(s.charAt(x))) {
						valid = false;
						break;
					}
				}

				if (valid) {
					ans = Math.min(ans, j - i);
				}
			}
		}

		return ans;
	}

	static boolean allUnique(String s) {
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (!set.add(c))
				return false;
		}
		return true;
	}
}
