package com.anutosh.tree;

public class BinaryTree {

	public Node rootNode;
	
	public Node insertRoot(int val){
		rootNode = new Node();
		rootNode.data = val;
		return rootNode;
	}
	
	public Node insertL(Node node, int val){
		Node n = new Node();
		n.data = val;
		node.left = n;
		return n;
	}
	
	public Node insertR(Node node, int val){
		Node n = new Node();
		n.data = val;
		node.right = n;
		return n;
	}
	
	
}
