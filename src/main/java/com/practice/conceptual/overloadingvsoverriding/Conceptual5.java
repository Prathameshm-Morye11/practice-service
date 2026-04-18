package com.practice.conceptual.overloadingvsoverriding;

//Concept 5: Static Method Behavior

//Questions:
//Output?
//Is this overriding?
//Why static methods behave differently?

public class Conceptual5 {
	public static void main(String[] args) {
		Parent5 p = new Child5();
		p.show();
	}
}

class Parent5 {
	static void show() {
		System.out.println("Parent");
	}
}

class Child5 extends Parent5 {
	static void show() {
		System.out.println("Child");
	}
}
