package com.practice.conceptual.overloadingvsoverriding;

// Concept 9 :  Upcasting & Downcasting

//Questions:

//Will it compile?
//Why?
//How to fix it?

public class Conceptual9 {

	public static void main(String[] args) {
		Parent9 p9 = new Child9();

		// TODO: Uncomment below
		// p9.display();
	}
}

class Parent9 {
	void show() {
		System.out.println("Parent");
	}

	// TODO : How to fix it?
//	void display() {
//		System.out.println("Parent display");
//	}
}

class Child9 extends Parent9 {
	void display() {
		System.out.println("Child");
	}
}
