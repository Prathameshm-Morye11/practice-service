package com.practice.conceptual.overloadingvsoverriding;

//Concept : Method Overriding vs Overloading

// Question :
// Is this overriding or overloading?
// Why is Parent.show() called?

class Parent1 {
	public void show() {
		System.out.println("Parent");
	}
}

class child1 extends Parent1 {
	public void show(int x) {
		System.out.println("Child");
	}
}

public class Conceptual1 {

	public static void main(String[] args) {
		Parent1 p = new child1();
		p.show();
	}
}