package com.practice.stream.interview.atos;

import java.util.ArrayList;
import java.util.List;

public class Conceptual7 {

	public static void main(String[] args) {
		List myList = new ArrayList<>();
		myList.add("1");
		myList.add(1);

		System.out.println(myList);
		System.out.println(myList.get(1));
	}
}
