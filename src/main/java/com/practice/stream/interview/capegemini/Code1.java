package com.practice.stream.interview.capegemini;

public class Code1 {

	public static void main(String[] args) {

//	In a shop, a chocolate costs rupees 1. Shopkeeper offers one chocolate when return 4 chocolate wrappers.
//			Write a program to find total chocolates obtained by a person with rupees N.

		int n = 5;
		int wrapperCount = n;
		int totalCountOfChocolates = n;

		while (wrapperCount >= 4) {
			wrapperCount = wrapperCount / 4;
			totalCountOfChocolates = totalCountOfChocolates + wrapperCount;
			wrapperCount = wrapperCount + wrapperCount % 4;
		}

		System.out.println(totalCountOfChocolates);
	}

}