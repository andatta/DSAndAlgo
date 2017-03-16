package com.anutosh.tree;

public class DFS {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		inOrderTraversal(root);
		System.out.println();
		preOrderTraversal(root);
		System.out.println();
		postOrderTraversal(root);
	}
	
	public static void inOrderTraversal(Node root){
		if(root == null){
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	
	public static void preOrderTraversal(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public static void postOrderTraversal(Node root){
		if(root == null){
			return;
		}
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

}
