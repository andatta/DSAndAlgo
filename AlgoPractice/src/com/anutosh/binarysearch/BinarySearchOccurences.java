package com.anutosh.binarysearch;

public class BinarySearchOccurences {

	public static void main(String[] args) {
		System.out.println(countOccuerences(new int[]{1, 1, 2, 2, 2, 2, 3}, 5));

	}
	
	private static int countOccuerences(int[] arr, int key){
		int i = first(arr, 0, arr.length -1, key);
		if(i == -1){
			return -1;
		}
		int j = last(arr, i, arr.length -1, key);
		
		return (j - i) + 1; 
	}
	
	private static int first(int[] arr, int left, int right, int key){
		if(left <= right){
			int middle = (left + right)/2;
			if((middle == 0 || key > arr[middle - 1]) && arr[middle] == key){
				return middle;
			}else if(key > arr[middle]){
				return first(arr, middle + 1, right, key);
			}else{
				return first(arr, left, middle -1, key);
			}
		}
		return -1;
	}
	
	private static int last(int[] arr, int left, int right, int key){
		if(left <= right){
			int middle = (left + right)/2;
			if((middle == arr.length -1 || key < arr[middle + 1]) && arr[middle] == key){
				return middle;
			}else if(key < arr[middle]){
				return last(arr, left, middle - 1, key);
			}else{
				return last(arr, middle + 1, right, key);
			}
		}
		return -1;
	}

}
