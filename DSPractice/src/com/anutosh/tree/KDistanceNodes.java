package com.anutosh.tree;

public class KDistanceNodes {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		printKDistance(root, 3);

	}
	
	private static void printKDistance(Node root, int k){
		if(root == null){
			return;
		}
		
		if(k == 0){
			System.out.print(root.data + " ");
			return;
		}
		
		printKDistance(root.left, k - 1);
		printKDistance(root.right, k - 1);
	}

}
