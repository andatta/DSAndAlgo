package com.anutosh.bst;

import com.anutosh.tree.DFS;
import com.anutosh.tree.Node;
import com.anutosh.tree.Tree;

public class SearchAndInsert {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		System.out.print(findKey(root, 10));
		insert(root, 10);
		DFS.inOrderTraversal(root);
	}
	
	private static boolean findKey(Node root, int key){
		if(root == null){
			return false;
		}
		
		if(root.data == key){
			return true;
		}else if(key > root.data){
			return findKey(root.right, key);
		}else{
			return findKey(root.left, key);
		}
	}
	
	private static void insert(Node root, int key){
		if(root == null){
			return;
		}
		if(key > root.data){
			if(root.right == null){
				root.right = new Node(key);
			}else{
				insert(root.right, key);
			}
		}else{
			if(root.left == null){
				root.left = new Node(key);
			}else{
				insert(root.left, key);
			}
		}
	}

}
