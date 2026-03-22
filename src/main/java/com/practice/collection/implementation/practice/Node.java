package com.practice.collection.implementation.practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

	Node next;
	int data;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
