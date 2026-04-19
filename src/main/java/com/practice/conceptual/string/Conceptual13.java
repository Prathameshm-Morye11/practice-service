package com.practice.conceptual.string;

//Concept 13 : Output Prediction
public class Conceptual13 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";

		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
		System.out.println(s2.intern() == s1);

		String s4 = "hello";
		String s5 = new String("hello");
		String s6 = s5.intern();

		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
	}
}
