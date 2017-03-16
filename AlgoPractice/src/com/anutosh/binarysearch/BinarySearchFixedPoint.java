package com.anutosh.binarysearch;

public class BinarySearchFixedPoint {

	public static void main(String[] args) {
		System.out.println(findFixedPoint(new int[]{-10, -5, 3, 4, 7, 9}));

	}
	
	private static int findFixedPoint(int[] arr){
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right){
			int middle = (left + right)/2;
			
			if(arr[middle] == middle){
				return arr[middle];
			}else if(arr[middle] > middle){
				right = middle - 1;
			}else{
				left = middle + 1;
			}
		}
		return -1;
	}

}
