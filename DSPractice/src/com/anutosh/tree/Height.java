package com.anutosh.tree;

public class Height {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		System.out.println(height(root));
	}
	
	private static int height(Node root){
		if(root == null){
			return 0;
		}
		
		return 1 + Math.max(height(root.left), height(root.right));
	}

}
