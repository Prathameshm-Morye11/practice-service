package com.practice.stream.interview.atos;

public class Conceptual6 {

	public static void main(String[] args) throws YoungerAgeException {
		try {
			int num = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception catch");
			throw new YoungerAgeException("Age is under 18");
		} finally {
			System.out.println("Finally Executed");
		}
	}

}
