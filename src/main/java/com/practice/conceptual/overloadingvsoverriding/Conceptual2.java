package com.practice.conceptual.overloadingvsoverriding;

//Concept : Constructor Execution Order

//Questions:
//What is the output?
//Why is parent constructor called first?
//What happens if parent has only parameterized constructor?

class Parent2 {
	Parent2() {
		System.out.println("Parent Constructor");
	}
}

class Child2 extends Parent2 {
	Child2() {
		System.out.println("Child Constructor");
	}
}

public class Conceptual2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
	}
}
