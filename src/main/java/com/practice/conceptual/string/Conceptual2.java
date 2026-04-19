package com.practice.conceptual.string;


//Concept 2: intern()

public class Conceptual2 {
	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = s1.intern();
		System.out.println(s1 == s2);
	}
}
