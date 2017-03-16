package com.anutosh.heap;

public class KLargestElements {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 23, 12, 9, 30, 2, 50};
		findKLargestElements(arr, 3);
	}
	
	
	public static void findKLargestElements(int[] arr, int k){
		int n = arr.length;
		
		for(int i = n/2 - 1; i >= 0; i--){
			heapify(arr, n, i);
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < k; i++){
			System.out.print(extractMax(arr, n - i) + " ");
		}
	}
	
	public static int extractMax(int[] arr, int n){
		int max = arr[0];
		arr[0] = arr[n-1];
		
		heapify(arr, n-1, 0);
		return max;
	}
	
	public static void heapify(int[] arr, int n, int i){
		int largest = i;
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;
		
		if(left < n && arr[left] > arr[largest]){
			largest = left;
		}
		
		if(right < n && arr[right] > arr[largest]){
			largest = right;
		}
		
		if(largest != i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
	}

}
