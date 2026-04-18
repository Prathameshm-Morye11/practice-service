package com.practice.conceptual.overloadingvsoverriding;

//Concept 4: Final Method Behavior

//Questions:
//Will this compile?
//Why is final used?

public class Conceptual4 {

}

class Parent4 {
	final void display() {
		System.out.println("Parent display");
	}
}

class Child4 extends Parent4 {
	// TODO: Uncomment it
//	void display() {     
//		System.out.println("Child display"); 
//	}
}