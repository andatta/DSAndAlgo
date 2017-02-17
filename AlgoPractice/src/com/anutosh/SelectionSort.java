package com.anutosh;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 2, 4, 6, 1, 3};
		
		for(int i = 0; i < arr.length; i++){
			int smallestIndex = i;
			int min = arr[i];
			for(int j = i; j < arr.length; j++){
				if(arr[j] < min){
					smallestIndex = j;
					min = arr[j];
				}
			}
			//swap
			arr[smallestIndex] = arr[i];
			arr[i] = min;
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}

}