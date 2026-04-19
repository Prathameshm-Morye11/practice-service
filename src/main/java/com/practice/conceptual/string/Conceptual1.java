package com.practice.conceptual.string;

//Concept 1: String Pool vs Heap
public class Conceptual1 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
}
