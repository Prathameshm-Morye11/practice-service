package com.practice.collection.implementation.practice;

public class SingleLLS {

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

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.println("null");
	}

	public int count() {

		Node current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}

		System.out.println("Total Count ==> " + count);
		return count;
	}

	public void inserAtFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.setNext(newNode);
		}
	}

	public void insertAtPos(int data, int position) {

		int count = count();
		if (position == 1) {
			inserAtFirst(data);
		} else if (position == count + 1) {
			insertAtLast(data);
		} else {
			Node newNode = new Node(data);
			Node current = head;
			for (int i = 1; i < position - 1; i++) {
				current = current.next;
			}
			newNode.setNext(current.next);
			current.setNext(newNode);
		}

	}

	public void reverse() {
		Node next = null;
		Node current = head;
		Node prev = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(String[] args) {
		SingleLLS s = new SingleLLS();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.reverse();
		s.inserAtFirst(5);
		s.insertAtLast(50);
		s.insertAtPos(25, 4);
		s.printList();
		s.remove(20);
		s.printList();
		s.remove(40);
		s.printList();
		s.count();
	}
}
