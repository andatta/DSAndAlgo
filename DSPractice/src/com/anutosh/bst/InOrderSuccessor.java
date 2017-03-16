package com.anutosh.bst;

import com.anutosh.tree.Node;
import com.anutosh.tree.Tree;

public class InOrderSuccessor {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		Node n = root.right;
		Node succ = findInOrderSuccessor(root, n);
		System.out.println(succ.data);

	}
	
	private static Node min(Node n){
		Node curr = n;
		
		while(curr.left != null){
			curr = curr.left;
		}
		return curr;
	}
	
	private static Node findInOrderSuccessor(Node root, Node n){
		Node succ = null;
		if(n.right != null){
			return min(n.right);
		}
		
		while(root != null){
			if(n.data < root.data){
				succ = root;
				root = root.left;
			}else if(n.data > root.data){
				succ = root;
				root = root.right;
			}else{
				break;
			}
		}
		return succ;
	}

}
