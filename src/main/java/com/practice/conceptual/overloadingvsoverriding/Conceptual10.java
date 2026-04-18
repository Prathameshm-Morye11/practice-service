package com.practice.conceptual.overloadingvsoverriding;

// Concept 10 : instanceof + Downcasting

//Questions:
//Why instanceof is important?
//What happens without it?

public class Conceptual10 {

	public static void main(String[] args) {
		Parent10 p10 = new Child10();

		if (p10 instanceof Child10) {
			Child10 c10 = (Child10) p10;
			c10.display();
		}
	}
}

class Parent10 {
	void show() {
		System.out.println("Parent");
	}
}

class Child10 extends Parent10 {
	void display() {
		System.out.println("Child");
	}
}