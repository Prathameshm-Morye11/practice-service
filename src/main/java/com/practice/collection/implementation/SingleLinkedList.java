package com.practice.collection.implementation;

import com.practice.bean.Node;

public class SingleLinkedList {

	Node head;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void remove(int key) {

		Node current = head;
		Node previous = null;

		if (current != null && current.data == key) {
			head = current.next;
			return;
		}

		while (current != null && current.data != key) {
			previous = current;
			current = current.next;
		}

		if (current == null) {
			return;
		}

		previous.next = current.next;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);

		linkedList.print();
		linkedList.remove(20);
		linkedList.print();
		linkedList.remove(40);
		linkedList.print();
	}
}
