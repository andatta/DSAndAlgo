package com.anutosh.arrays;

public class PairAndSum {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 4, 45, 6, 10, -8};
		int n = arr.length;
		for(int i = n/2 - 1; i >= 0; i--){
			heapifyMax(arr, n, i);
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		for(int i = n -1; i>= 0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapifyMax(arr, i, 0);
		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(hasArrayTwoCandidates(arr, n, 0));
	}
	
	private static void heapifyMax(int[] arr, int n, int i){
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
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			
			heapifyMax(arr, n, largest);
		}
	}
	
	private static int hasArrayTwoCandidates(int[] arr, int n, int sum){
		int left = 0;
		int right = n -1;
		
		while(left < right){
			if(arr[left] + arr[right] == sum){
				return 1;
			}else if(arr[left] + arr[right] < sum){
				left++;
			}else{
				right--;
			}
		}
		return 0;
	}

}
