package com.anutosh.bst;

import com.anutosh.tree.Node;

public class CeilAndFloor {

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);

		root.right = new Node(22);

		System.out.println(findCeil(root, 11));
		System.out.println(findFloor(root, 11));
	}

	private static int findCeil(Node root, int key) {
		if (root == null) {
			return -1;
		}

		if (key == root.data) {
			return root.data;
		} else if (key > root.data) {
			return findCeil(root.right, key);
		} 
		
		int n = findCeil(root.left, key);
		return n >= key ? n : root.data;
	}
	
	private static int findFloor(Node root, int key){
		if(root == null){
			return -1;
		}
		
		if(root.data == key){
			return root.data;
		}else if(key < root.data){
			return findFloor(root.left, key);
		}
		
		int floor = findFloor(root.right, key);
		return (floor <= key && floor > root.data) ? floor : root.data;
	}
	

}
