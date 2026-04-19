package com.practice.conceptual.string;

//Conceptual 4 : Compile-time vs Runtime Concatenation

public class Conceptual3 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "script";
		String s3 = "java" + "script";
		String s4 = s1 + s2;

		System.out.println(s3 == s4);
	}
}
