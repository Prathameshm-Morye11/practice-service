package com.practice.stream.interview.ey;

public class SlotMachine {

	public static void main(String[] args) {

		int[] num = { 123, 456, 908, 12 };
		int result = sumMaxDigits(num);

		System.out.println(result);
	}

	public static int sumMaxDigits(int[] numbers) {
		int sum = 0;

		for (int num : numbers) {
			int maxDigit = 0;

			for (char c : String.valueOf(num).toCharArray()) {
				maxDigit = Math.max(maxDigit, c - '0');
			}

			sum += maxDigit;
		}

		return sum;
	}
}
