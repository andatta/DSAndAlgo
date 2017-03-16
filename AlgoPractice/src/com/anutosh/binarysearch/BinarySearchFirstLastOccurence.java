package com.anutosh.binarysearch;

public class BinarySearchFirstLastOccurence {

	public static void main(String[] args) {
		System.out.println(findFirst(new int[]{1, 3, 5, 5, 5, 5 ,67, 123, 125}, 0, 8, 30));
		System.out.println(findLast(new int[]{1, 3, 5, 5, 5, 5 ,67, 123, 125}, 0, 8, 30));

	}
	
	private static int findFirst(int[] arr, int left, int right, int key){
		if(left > right){
			return -1;
		}
		int middle = (left + right)/2;
		if(arr[middle] == key){
			if(left == right){
				return middle;
			}else if((middle -1) >= left && arr[middle - 1] < key){
				return middle;
			}else{
				return findFirst(arr, left, middle - 1, key);
			}
		}else if(arr[middle] < key){
			if((middle + 1) <= right && arr[middle + 1] == key){
				return middle + 1;
			}else{
				return findFirst(arr, middle + 1, right, key);
			}
		}else{
			return findFirst(arr, left, middle - 1, key);
		}
		
	}
	
	private static int findLast(int[] arr, int left, int right, int key){
		if(left > right){
			return -1;
		}
		int middle = (left + right)/2;
		if(arr[middle] == key){
			if(left == right){
				return middle;
			}else if((middle + 1) <= right && arr[middle + 1] > key){
				return middle;
			}else{
				return findLast(arr, middle + 1, right, key);
			}
		}else if(arr[middle] < key){
			return findLast(arr, middle + 1, right, key);
		}else{
			if((middle - 1) >= left && arr[middle - 1] == key){
				return middle - 1;
			}
			return findLast(arr, left, middle - 1, key);
		}
		
	}

}
