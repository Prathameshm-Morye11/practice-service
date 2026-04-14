package com.practice.conceptual.interview.accolite;

public class Conceptual2 {

	public static void main(String[] args) {
		Parents2 p = new Child2();
		System.out.println(p.value); // Overriding is not possible for variable/covariant variables

		System.out.println(p.getObject()); //Java allows covariant return types in method overriding.
	}
}
