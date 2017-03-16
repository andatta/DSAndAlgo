package com.anutosh.bst;

import com.anutosh.tree.DFS;
import com.anutosh.tree.Node;

public class BalancedBST {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		Node root = createBalancedBST(arr, 0, arr.length -1);
		DFS.inOrderTraversal(root);
	}
	
	public static Node createBalancedBST(int[] arr, int left, int right){
		if(left > right){
			return null;
		}
		
		int middle = (left + right)/2;
		Node root = new Node(arr[middle]);
		root.left = createBalancedBST(arr, left, middle -1);
		root.right = createBalancedBST(arr, middle + 1, right);
		
		return root;
	}

}
