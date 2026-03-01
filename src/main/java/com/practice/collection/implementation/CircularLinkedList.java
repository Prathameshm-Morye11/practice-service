package com.practice.collection.implementation;

import com.practice.bean.Node;

public class CircularLinkedList {

	Node head;
	Node tail;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	// Remove node
	public void remove(int key) {

		if (head == null) {
			return;
		}

		Node current = head;
		Node previous = null;

		// Case 1: remove head node
		if (head.data == key) {

			// Only one node
			if (head == tail) {
				head = null;
				tail = null;
				return;
			}

			head = head.next;
			tail.next = head;
			return;
		}

		// Search node
		do {
			previous = current;
			current = current.next;

			if (current.data == key) {

				// If deleting tail
				if (current == tail) {
					tail = previous;
				}

				previous.next = current.next;
				return;
			}

		} while (current != head);
	}

	public void print() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node current = head;

		do {
			System.out.print(current.data + " -> ");
			current = current.next;
		} while (current != head);

		System.out.println("(back to head)");
	}

	public static void main(String[] args) {
		CircularLinkedList circularLL = new CircularLinkedList();
		circularLL.add(10);
		circularLL.add(20);
		circularLL.add(30);
		circularLL.add(40);

		circularLL.print();
		circularLL.remove(20);
		circularLL.print();
		circularLL.remove(40);
		circularLL.print();

	}
}
