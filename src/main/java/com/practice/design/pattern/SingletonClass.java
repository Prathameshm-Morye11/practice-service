package com.practice.design.pattern;

public class SingletonClass {

	private static SingletonClass singleObj;

	private SingletonClass() {

	}

	public static SingletonClass getSingletonObj() {

		if (singleObj == null) {
			synchronized (SingletonClass.class) {
				singleObj = new SingletonClass();
				return singleObj;
			}
		}
		return singleObj;
	}
}
