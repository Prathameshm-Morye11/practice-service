package com.practice.stream.interview;

public class Code1 {

	public static void main(String[] args) {
		String str = "PrathameshP01234567Test";
		String result = extractResult(str, 6);
		System.out.println(result);
	}

	private static String extractResult(String str, int length) {
		// TODO Auto-generated method stub
		if (str.isEmpty() || str == null) {
			return "";
		}

		int index = str.toUpperCase().indexOf("P0");

		if (index == -1) {
			return "";
		}

		int start = index + 2;
		if (start >= str.length()) {
			return "";
		}

		int end = Math.min(start + length, str.length());

		String result = str.substring(start, end);

		return result;
	}
}
