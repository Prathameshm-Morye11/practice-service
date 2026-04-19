package com.practice.conceptual.string;

public class Conceptual6 {

	// Concept 7 : Reference vs Object Confusion
	public static void main(String[] args) {

		String s1 = "java";
		String s2 = new String("java");
		String s3 = s2;

		System.out.println(s2 == s3);
	}
}
