package com.anutosh.heap;

public class KSortedArray {

	public static void main(String[] args) {
		
		int[] arr = new int[]{2, 6, 3, 12, 56, 8};
		sort(arr, 3);
	}
	
	public static void sort(int[]arr, int k){
		int[] hrr = new int[arr.length];
		
		for(int i = (k + 1)/2 -1; i >= 0; i--){
			HeapSort.heapifyMin(arr, k+1, i); 
		}
		for(int j = 0; j < arr.length; j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		for(int i = k + 1, ti = 0; ti < arr.length; i++, ti++){
			if(i < arr.length){
				hrr[ti] = arr[0];
				arr[0] = arr[i];
				HeapSort.heapifyMin(arr, k+1, 0);
				
				for(int j = 0; j < arr.length; j++){
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}else{
				hrr[ti] = KSmallestElements.extractMin(arr, arr.length);
			}
		}
		
		System.out.println();
		for(int i = 0; i < hrr.length; i++){
			System.out.print(hrr[i] + " ");
		}
	}

}
