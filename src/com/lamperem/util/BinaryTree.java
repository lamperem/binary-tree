package com.lamperem.util;

/**
 * Class to define binary tree
 * @author glopez
 *
 */
public class BinaryTree {
	Node root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	private Node createNode(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = createNode(current.left, value);
	    } else if (value > current.value) {
	        current.right = createNode(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	public void add(int value) {
	    root = createNode(root, value);
	}
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	
	public void showTree() {
		traverseInOrder(this.root);
	}
	

	
}
