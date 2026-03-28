package com.practice.stream.interview.mphasis;

public class Code3 {

	public static void main(String[] args) {
		// input: AABCCBDA
		// output:A2,B1,C2,B1,D1,A1

		String str = "AABCCBDD";

		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			int count = 1;

			while (i + 1 < str.length() && currChar == str.charAt(i + 1)) {
				count++;
				i++;
			}

			System.out.println(currChar + "" + count);
		}
	}
}
