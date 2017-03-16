package com.anutosh.bst;

import com.anutosh.tree.DFS;
import com.anutosh.tree.Node;
import com.anutosh.tree.Tree;

public class PreorderToPostOrder {

	public static void main(String[] args) {
		Node root = Tree.createTestTree();
//		DFS.preOrderTraversal(root);
//		System.out.println();
//		DFS.inOrderTraversal(root);
//		System.out.println();
//		DFS.postOrderTraversal(root);
		
		int[] pre = new int[] { 3, 2, 1, 5, 4, 6, 7 };
		int[] in = new int[pre.length];
		
		for(int i = 0; i < pre.length; i++){
			in[i] = pre[i];
		}
		
		quickSort(in, 0, in.length - 1);
		
		for(int i = 0; i < in.length; i++){
			System.out.print(in[i] + " ");
		}

	}
	
	private static void quickSort(int[] arr, int p, int r){
		if(p >= r){
			return;
		}
		
		int q = p;
		
		for(int j = q; j <= r; j++){
			if(j == r){
				int temp = arr[r];
				arr[r] = arr[q];
				arr[q] = temp;
			}else{
				if(arr[j] <= arr[r]){
					int temp =arr[j];
					arr[j] = arr[q];
					arr[q] = temp;
					
					q++;
				}
			}
		}
		
		quickSort(arr, p, q - 1);
		quickSort(arr, q + 1, r);
	}
	
	

}
