package com.practice.stream.interview.atos;

public class Conceptual1 {

	public static void main(String[] args) {
		String s1 = "Notes";

		String s2 = new String("Notes");

		String s3 = new String("Notes");

		StringBuffer s4 = new StringBuffer("Notes");

		StringBuffer s5 = new StringBuffer("Notes");

		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s3)); // true
		System.out.println(s4.equals(s5)); // false
		System.out.println(s1 == s3); // false
		System.out.println(s2.equals(s4)); // false
	}
}
