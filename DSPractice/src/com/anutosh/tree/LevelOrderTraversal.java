package com.anutosh.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
		levelOrderTraversal(root);

	}
	
	private static void levelOrderTraversal(Node root){
		if(root == null){
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node curr = queue.remove();
			System.out.print(curr.data);
			
			if(curr.left != null){
				queue.add(curr.left);
			}
			
			if(curr.right != null){
				queue.add(curr.right);
			}
		}
	}

}
