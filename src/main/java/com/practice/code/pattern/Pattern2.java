package com.practice.code.pattern;

public class Pattern2 {

	public static void main(String[] args) {

		int row = 4;
		int num = 1;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(num + "");
				num++;
			}

			System.out.println();
		}
	}
}
