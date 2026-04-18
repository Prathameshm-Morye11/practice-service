package com.practice.conceptual.overloadingvsoverriding;

//Concept 8: Runtime Polymorphism (Core Question)

//Questions:
//Output?
//What type of polymorphism is this?
//How JVM decides which method to call?

public class Conceptual8 {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
	}
}

class Animal {
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}