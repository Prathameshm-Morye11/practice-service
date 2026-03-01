package com.practice.code;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.println(fib(i));
		}
	}

	public static Integer fib(int number) {

		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}

		return fib(number - 1) + fib(number - 2);
	}
}
