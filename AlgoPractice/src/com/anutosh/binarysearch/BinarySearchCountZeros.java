package com.anutosh.binarysearch;

public class BinarySearchCountZeros {

	public static void main(String[] args) {
		System.out.println(countZeros(new int[]{1, 1, 1, 1, 1}));

	}
	
	private static int countZeros(int[] arr){
		int first = findFirstZero(arr, 0, arr.length -1);
		if(first == -1){
			return 0;
		}
		return (arr.length - first);
	}
	
	private static int findFirstZero(int[] arr, int left, int right){
		if(left > right){
			return -1;
		}
		int middle = (left + right)/2;
		if(arr[middle] == 0){
			if((middle - 1) < left || (middle + 1) > right){
				return middle;
			}else if((middle -1) >= left && arr[middle - 1] == 1){
				return middle;
			}else{
				return findFirstZero(arr, left, middle -1);
			}
		}else{
			if((middle + 1) <= right && arr[middle + 1] == 0){
				return middle + 1;
			}else{
				return findFirstZero(arr, middle + 1, right);
			}
		}
	}

}
