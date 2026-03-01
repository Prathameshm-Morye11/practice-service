package com.practice.collection.implementation;

import com.practice.bean.BinaryNode;

public class BinarySearchTree {

	BinaryNode root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public BinaryNode insertRec(BinaryNode root, int data) {

		if (root == null) {
			root = new BinaryNode(data);
			return root;
		}
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else {
			root.right = insertRec(root.right, data);
		}

		return root;
	}

	public void inOrder(BinaryNode root) {

		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public void preOrder(BinaryNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void postOrder(BinaryNode root) {

		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(20);
		tree.insert(3);
		tree.insert(7);

		System.out.println("Inorder Traversal:");
		tree.inOrder(tree.root);

		System.out.println("\nPreOrder Traversal:");
		tree.preOrder(tree.root);

		System.out.println("\nPostOrder Traversal:");
		tree.postOrder(tree.root);
	}
}
