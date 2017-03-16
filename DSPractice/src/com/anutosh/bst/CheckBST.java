package com.anutosh.bst;

import com.anutosh.tree.Node;
import com.anutosh.tree.Tree;

public class CheckBST {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		System.out.print(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}
	
	public static boolean checkBST(Node root, int min, int max){
		if(root == null){
			return true;
		}
		
		if(root.data > min && root.data < max){
			return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
			
		}else{
			return false;
		}
	}

}
