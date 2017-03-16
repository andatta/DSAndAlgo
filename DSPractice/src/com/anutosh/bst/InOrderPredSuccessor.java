package com.anutosh.bst;

import com.anutosh.tree.Node;
import com.anutosh.tree.Tree;

public class InOrderPredSuccessor {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		findPredAndSuccessor(root, 5, null);
	}

	private static void findPredAndSuccessor(Node root, int key, Node prev) {
		if (root == null) {
			return;
		}

		if (root.data == key) {
			if(prev != null){
				System.out.println("Predecessor " + prev.data);
			}
			if (root.left != null) {
				System.out.println("Successor " + root.left.data);
			}
		}else if(key > root.data){
			findPredAndSuccessor(root.right, key, root);
		}else{
			findPredAndSuccessor(root.left, key, root);
		}
	}

}
