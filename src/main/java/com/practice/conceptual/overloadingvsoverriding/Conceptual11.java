package com.practice.conceptual.overloadingvsoverriding;

// Concept 11 : Compile-time vs Runtime Polymorphism

//Questions:
//Which polymorphism?
//When method resolution happens?

public class Conceptual11 {

	public static void main(String[] args) {

		Conceptual11 c11 = new Conceptual11();
		c11.add(30, 20);
		c11.add(30.00, 10.00);
	}

	void add(int a, int b) {
		System.out.println(a - b);
	}

	void add(double a, double b) {
		System.out.println(a + b);
	}
}
