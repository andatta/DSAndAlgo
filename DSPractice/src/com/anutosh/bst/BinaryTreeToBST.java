package com.anutosh.bst;

import com.anutosh.tree.DFS;
import com.anutosh.tree.Node;

public class BinaryTreeToBST {
	
	static int pos = 0;

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		
		root.right = new Node(3);
		DFS.inOrderTraversal(root);
		System.out.println();
		binaryTreeToBST(root);
		DFS.inOrderTraversal(root);
	}
	
	public static Node binaryTreeToBST(Node root){
		int[] in = new int[4];
		createInOrderArray(root, in, in.length/2);
		quickSort(in, 0, in.length - 1);
		toBST(root, in);
		return root;
	}
	
	public static void toBST(Node root, int[] arr){
		if(root == null){
			return;
		}
		
		toBST(root.left, arr);
		root.data = arr[pos];
		pos++;
		toBST(root.right, arr);
	}
	
	public static void createInOrderArray(Node root, int[] arr, int pos){
		if(root == null){
			return;
		}
		
		createInOrderArray(root.left, arr, pos - 1);
		arr[pos] = root.data;
		createInOrderArray(root.right, arr, pos + 1);
	}
	
	public static void quickSort(int[] arr, int p, int r){
		if(p >= r){
			return;
		}
		
		int q = p;
		
		for(int j = q; j <= r; j++){
			if(j == r){
				int temp = arr[q];
				arr[q] = arr[r];
				arr[r] = temp;
			}else{
				if(arr[j] <= arr[r]){
					int temp = arr[q];
					arr[q] = arr[j];
					arr[j] = temp;
					
					q++;
				}
			}
		}
		
		quickSort(arr, p, q -1);
		quickSort(arr, q + 1, r);
	}

}
