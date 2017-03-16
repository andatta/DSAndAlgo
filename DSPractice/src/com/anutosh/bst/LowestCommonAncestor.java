package com.anutosh.bst;

import com.anutosh.tree.Node;
import com.anutosh.tree.Tree;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		Node lca = findLCA(root, 4, 5);
		if(lca != null){
			System.out.println(lca.data);
		}

	}
	
	private static Node findLCA(Node root, int n1, int n2){
		if(root == null){
			return null;
		}
		
		if(root.data > n1 && root.data > n2){
			return findLCA(root.left, n1, n2);
		}else if(root.data < n1 && root.data < n2){
			return findLCA(root.right, n1, n2);
		}
		
		return root;
	}

}
