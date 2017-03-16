package com.anutosh.binarysearch;

public class BinarySearchCelilingFloor {

	public static void main(String[] args) {
		System.out.println(floorSearch(new int[] { 1, 2, 8, 10, 10, 12, 19 }, 0, 6, 5));

	}

	private static int floorSearch(int[] arr, int left, int right, int key){
		if(key < arr[left]){
			return -1;
		}
		if(key > arr[right]){
			return arr[right];
		}
		
		int middle = (left + right)/2;
		if(arr[middle] == key){
			return arr[middle];
		}else if(key < arr[middle]){
			if((middle - 1) >= left && arr[middle - 1] < key){
				return arr[middle - 1];
			}else{
				return floorSearch(arr, left, middle -1, key);
			}
		}else{
			if((middle + 1) <= right && arr[middle + 1] > key){
				return arr[middle];
			}else{
				return floorSearch(arr, middle + 1, right, key);
			}
		}
	}

}
