package com.practice.conceptual.overloadingvsoverriding;

// Concept 13 : Dynamic Method Dispatch Edge Case

//Questions:
//Which line fails?
//Why?

public class Conceptual13 {

	public static void main(String[] args) {
		Parent13 p13 = new Child13();
		p13.show();

		// TODO: Uncomment it
//		p13.display();
	}
}

class Parent13 {
	void show() {
		System.out.println("Parent");
	}

//  Solution
//	void display() {
//		System.out.println("Display");
//	}
}

class Child13 extends Parent13 {
	void show() {
		System.out.println("Child");
	}

	void display() {
		System.out.println("Display");
	}
}