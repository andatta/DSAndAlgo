package com.anutosh.binarysearch;

public class BinSearchRotatedArray {

	public static void main(String[] args) {
		System.out.println(findMin(new int[]{2}));

	}
	
	private static int findMin(int[] arr){
		int left = 0;
		int right = arr.length -1;
		
		while(left < right){
			int middle = (left + right)/2;
			
			if(middle != 0 && arr[middle] < arr[middle - 1]){
				return arr[middle];
			}else if(arr[middle] > arr[middle + 1]){
				return arr[middle + 1];
			}else if(arr[middle] > arr[right]){
				left = middle + 1;
			}else{
				right = middle -1;
			}
		}
		return arr[left];
	}

}
