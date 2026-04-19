package com.practice.conceptual.string;

// Concept 9 : Memory Reference Trick
public class Conceptual9 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = s1;
		s1 = "python";

		System.out.println(s2);
	}
}
