package com.practice.conceptual.string;

//Concept 7 : == vs equals with StringBuilder
public class Conceptual7 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");

		System.out.println(sb1.equals(sb2));
	}
}
