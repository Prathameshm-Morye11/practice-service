package com.practice.minegate;

import java.util.Optional;

public class OptionalQuestion {

	public static void main(String[] args) {
		Optional<String> opt = Optional.ofNullable(null);
		// System.out.println(opt.get());
		System.out.println(opt.isEmpty());
		System.out.println(opt.orElse("Empty")); // Solution
	}
}
