package com.anutosh.tree;

public class NodeAncestors {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		printAncestors(root, 1);

	}
	
	private static boolean printAncestors(Node root, int key){
		if(root == null){
			return false;
		}
		
		if(root.data == key){
			return true;
		}
		
		if(printAncestors(root.left, key) || printAncestors(root.right, key)){
			System.out.print(root.data + " ");
			return true;
		}
		
		return false;
	}

}
