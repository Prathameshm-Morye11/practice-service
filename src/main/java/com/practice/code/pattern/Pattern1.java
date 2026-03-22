package com.practice.code.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// Q.1)
		// 1
		// 11
		// 121
		// 1331

		int n1 = 5;
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				if ((i == j) || j == 0) {
					System.out.print("1");
				} else if (i < j) {
					System.out.print("");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
