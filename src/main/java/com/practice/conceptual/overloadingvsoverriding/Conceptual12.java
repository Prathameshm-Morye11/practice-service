package com.practice.conceptual.overloadingvsoverriding;

// Concept 12 : Covariant Return Type

//Questions:
//Is this valid?
//What is covariant return type?

public class Conceptual12 {

	public static void main(String[] args) {
		Parent12 p12 = new Child12();
		System.out.println(p12.get());
	}
}

class Parent12 {
	Object get() {
		return "Parent";
	}
}

class Child12 extends Parent12 {
	String get() {
		return "Child";
	}
}