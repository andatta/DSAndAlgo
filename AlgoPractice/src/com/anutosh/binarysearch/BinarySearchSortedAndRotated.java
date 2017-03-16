package com.anutosh.binarysearch;

public class BinarySearchSortedAndRotated {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 6, 7, 8, 9, 10, 1, 2, 3};
		System.out.println(findElement(arr, 20));
	}
	
	private static int findElement(int[] arr, int key){
		int pivot = findPivot(arr);
		if(pivot == -1){
			return binarySearch(arr, 0, arr.length -1, key);
		}
		
		if(arr[pivot] == key){
			return pivot;
		}else if(arr[0] > key){
			return binarySearch(arr, pivot + 1, arr.length -1, key);
		}else{
			return binarySearch(arr, 0, pivot - 1, key);
		}
	}
	
	private static int findPivot(int[] arr){
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right){
			int middle = (left + right)/2;
			
			if((middle - 1) >= left && arr[middle] < arr[middle - 1]){
				return middle;
			}else if((middle + 1) <= right && arr[middle] > arr[middle + 1]){
				return middle + 1;
			}else if(arr[middle] > arr[right]){
				left = middle + 1;
			}else{
				right = middle - 1;
			}
		}
		
		return -1;
	}
	
	private static int binarySearch(int[] arr, int left, int right, int key){
		while(left <= right){
			int middle = (left + right)/2;
			if(arr[middle] == key){
				return middle;
			}else if(arr[middle] < key){
				left = middle + 1;
			}else{
				right = middle - 1;
			}
		}
		
		return -1;
	}

}
