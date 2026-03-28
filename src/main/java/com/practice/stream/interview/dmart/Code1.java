package com.practice.stream.interview.dmart;

public class Code1 {

	public static void main(String[] args) {

		String str = "AABCAD";
		for (int i = 0; i < str.length(); i++) {
			Character currChar = str.charAt(i);
			int count = 1;
			while (i + 1 < str.length() && currChar == str.charAt(i + 1)) {
				count++;
				i++;
			}
			
			if (count == 1) {
				System.out.println(currChar);
				break;
			}
		}
	}
}
