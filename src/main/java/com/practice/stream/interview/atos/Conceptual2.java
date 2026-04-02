package com.practice.stream.interview.atos;

public class Conceptual2 {

	public static void main(String[] args) {

		int value = 0;

		Integer result = operation(value);
		System.out.println(result); // 20
	}

	private static Integer operation(int value) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			return 10;
		} finally {
			return 20;
		}

		// TODO Auto-generated method stub

	}
}
