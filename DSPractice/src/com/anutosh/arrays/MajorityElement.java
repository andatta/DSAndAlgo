package com.anutosh.arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = new int[]{3,3,4,2,4,4,2,4,4};
		int n = arr.length;
		int majority = n/2 + 1;
		
		Node root = null;
		for(int i = 0; i < n; i++){
			root = insert(root, arr[i], majority);
		}
		
	}
	
	private static Node insert(Node root, int data, int majority){
		if(root == null){
			return new Node(data, 1);
		}
		Node curr;
		if(root.data > data){
			curr = insert(root.left, data, majority);
			root.left = curr;
		}else if(root.data < data){
			curr = insert(root.right, data, majority);
			root.right = curr;
		}else{
			if(root.count >= majority){
				System.out.println(root.data);
			}else{
				root.count = root.count + 1;
			}
		}
		return root;
	}
	
	private static class Node{
		int data;
		int count;
		Node left;
		Node right;
		
		public Node(int data, int count){
			this.data = data;
			this.count = count;
		}
	}

}
