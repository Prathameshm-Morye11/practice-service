package com.practice.stream.interview.atos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
}
