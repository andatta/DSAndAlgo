package com.anutosh;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		System.out.print(nonRecBinarySearch(200, arr));
	}
	
	private static int nonRecBinarySearch(int query, int[] arr){
		int min = 0;
		int max = arr.length - 1;
		
		
		while(min <= max){
			int middle = (max + min)/2;
			if(arr[middle] == query){
				return middle;
			}else if(arr[middle] < query){
				min = middle + 1;
			}else if(arr[middle] > query){
				max = middle - 1;
			}
		}
		
		return -1;
	}
	
	private static int binarySearch(int query, int[] arr, int min, int max){
		if(min <= max && max != 0){
			int middle = min + (max - min)/2;
			if(arr[middle] == query){
				return middle;
			}else if(arr[middle] < query){
				return binarySearch(query, arr, middle + 1, max);
			}else if(arr[middle] > query){
				return binarySearch(query, arr, min, middle);
			}
		}
		return -1;
	}

}
