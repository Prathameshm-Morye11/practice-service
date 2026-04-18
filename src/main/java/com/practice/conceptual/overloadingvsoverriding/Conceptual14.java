package com.practice.conceptual.overloadingvsoverriding;

// Concept 14 : Method Overloading Ambiguity

//Questions:
//Output?
//Why ambiguity happens?

public class Conceptual14 {

	void show(int a) {
		System.out.println("int");
	}

	void show(Integer a) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		Conceptual14 c14 = new Conceptual14();
		c14.show(null);
	}
}
