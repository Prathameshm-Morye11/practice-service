package com.practice.stream.interview.atos;

public class Conceptual4 {

	public static void main(String[] args) {
		Person p = new Person("abd");
		m1(p);

		System.out.println(p.getName());
	}

	public static void m1(Person p) {
		p = new Person("Prathamesh");
	}
}
