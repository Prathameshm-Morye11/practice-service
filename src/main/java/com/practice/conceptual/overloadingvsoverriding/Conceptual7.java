package com.practice.conceptual.overloadingvsoverriding;

//Concept 7: Multilevel Inheritance

//Questions:
//Output?
//Which method is called and why?

public class Conceptual7 {
	public static void main(String[] args) {
		A obj = new C();
		obj.show();
	}
}

class A {
	void show() {
		System.out.println("A");
	}
}

class B extends A {
	void show() {
		System.out.println("B");
	}
}

class C extends B {
}