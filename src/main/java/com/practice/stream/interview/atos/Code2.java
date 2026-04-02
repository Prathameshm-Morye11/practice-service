package com.practice.stream.interview.atos;

public class Code2 {

	public static void main(String[] args) {
		// reverse the String
		String name = "Prathamesh Prakash Morye";
		String name1 = name.replaceAll(" ", "");

		// Scenario: 1
		String reverseString = "";
		for (int i = 0; i < name1.length(); i++) {
			reverseString = reverseString + name1.charAt(name1.length() - i - 1);
		}
		System.out.println(reverseString);

		// Scenario: 2
		StringBuffer reserString1 = new StringBuffer(name1).reverse();
		System.out.println(reserString1);
	}
}
