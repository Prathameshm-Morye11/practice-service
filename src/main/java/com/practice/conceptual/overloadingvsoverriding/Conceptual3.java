package com.practice.conceptual.overloadingvsoverriding;

//Concept 3 : Private Methods & Inheritance

//Questions:
//Is this overriding?
//Why or why not?
//What will happen if you call show()?

public class Conceptual3 {

	public static void main(String[] args) {
		Child3 child3 = new Child3();
		child3.show();
	}
}

class Parent3 {
	private void show() {
		System.out.println("Parent");
	}
}

class Child3 extends Parent3 {
	void show() {
		System.out.println("Child");
	}
}