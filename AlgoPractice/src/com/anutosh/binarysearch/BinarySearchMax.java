package com.anutosh.binarysearch;

public class BinarySearchMax {

	public static void main(String[] args) {
		System.out.println(findMax(new int[]{8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1}));

	}
	
	private static int findMax(int[] arr){
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right){
			int middle = (left + right)/2;
			if(middle == 0){
				return arr[middle];
			}else if(middle == arr.length - 1){
				return arr[middle];
			}else if(arr[middle] >= arr[middle + 1] && arr[middle] >= arr[middle - 1]){
				return arr[middle];
			}else if(arr[middle + 1] > arr[middle]){
				left = middle + 1;
			}else if(arr[middle - 1] > arr[middle]){
				right = middle - 1;
			}
		}
		return -1;
	}

}
