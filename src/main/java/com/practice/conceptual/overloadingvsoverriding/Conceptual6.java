package com.practice.conceptual.overloadingvsoverriding;

//Concept 6 : Super Keyword Usage

//Questions:
//Output?
//Why do we use super?
public class Conceptual6 {

	public static void main(String[] args) {
		Child6 child6 = new Child6();
		child6.print();
	}
}

class Parent6 {
	int x = 10;
}

class Child6 extends Parent6 {
	int x = 20;

	void print() {
		System.out.println(x);
		System.out.println(super.x);
	}
}