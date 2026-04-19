package com.practice.conceptual.string;

// Concept 12: Pass by Value (Reference Confusion)

public class Conceptual12 {

	public static void main(String[] args) {

		String s = "java";
		change(s);
		System.out.println(s);

	}

	static void change(String s) {
		s = "python";
	}

}