package com.practice.conceptual.interview.accolite;

public class Conceptual1 {

	public static void main(String[] args) {
		Parents1 p = new Child1();
//		Child c= new Parents(); // Invalid (cannot assign parent to child) 

		p.show();
		p.print();
//		c.show(); // (not possible since c is invalid)

	}
}
