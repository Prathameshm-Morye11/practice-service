package com.practice.stream.interview.others;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 25;
		boolean isPrime = prime(number);
		if (isPrime) {
			System.out.println("Given Number is Prime Number");
		} else {
			System.out.println("Given Number not a Prime Number");
		}
	}

	private static boolean prime(int number) {

		if (number <= 1) {
			return false;
		}

		if (number == 2) {
			return true;
		}

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
