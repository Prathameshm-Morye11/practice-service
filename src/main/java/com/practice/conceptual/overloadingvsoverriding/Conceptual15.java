package com.practice.conceptual.overloadingvsoverriding;

// Concept 15 : Real Interview Trick

//Question :
//Compile or not?
//Why static + non-static conflict?

public class Conceptual15 {

	public static void main(String[] args) {

		Parent15 p15 = new Child15();
		p15.show();
	}
}

class Parent15 {

	// TODO : Uncomment
//	void show() {
//		System.out.println("Parent");
//	}

	// Solution :
	static void show() {
		System.out.println("Parent");
	}
}

class Child15 extends Parent15 {
	static void show() {
		System.out.println("Child");
	}
}