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
		
		for(int i = k + 1, ti = 0; ti < arr.length; i++, ti++){
			if(i < arr.length){
				hrr[ti] = HeapSort.replaceMin(arr, k + 1, arr[i]);
			}else{
				hrr[ti] = KSmallestElements.extractMin(arr, arr.length - ti);
			}
		}
		for(int i = 0; i < hrr.length; i++){
			System.out.print(hrr[i] + " ");
		}
	}

}
