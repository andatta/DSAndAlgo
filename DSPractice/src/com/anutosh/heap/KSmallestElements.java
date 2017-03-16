package com.anutosh.heap;

public class KSmallestElements {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 23, 12, 9, 30, 2, 50};
		findKSmallestElements(arr, 3);
	}
	
	public static void findKSmallestElements(int[] arr, int k){
		int n = arr.length;
		
		for(int i = n/2 - 1; i >= 0; i--){
			HeapSort.heapifyMin(arr, n, i);
		}
		
		for(int i = 0; i < k; i++){
			System.out.print(extractMin(arr, n - i) + " ");
		}
		
		
	}
	
	public static int extractMin(int[] arr, int n){
		int min = arr[0];
		arr[0] = arr[n-1];
		HeapSort.heapifyMin(arr, n-1, 0);
		return min;
	}

}
