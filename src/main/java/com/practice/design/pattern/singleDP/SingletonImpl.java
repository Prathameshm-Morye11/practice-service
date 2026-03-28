package com.practice.design.pattern.singleDP;

public class SingletonImpl {

	public static void main(String[] args) {

		SingletonClass obj1 = SingletonClass.getSingletonObj();
		System.out.println("1st singletonObj ==> " + obj1.hashCode());
		SingletonClass obj2 = SingletonClass.getSingletonObj();
		System.out.println("2nd singletonObj ==> " + obj2.hashCode());
	}
}
