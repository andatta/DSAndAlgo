package com.anutosh;

import java.util.Random;

public class MergeSort {
	
	int[] arr = new int[] {14, 7, 3, 12, 9, 11, 6, 2};
	int[] helper = new int[arr.length];

	public static void main(String[] args) {
		
		new MergeSort().run();
	}
	
	private void run(){
		arr = new int[7];
		helper = new int[7];
        Random generator = new Random();
        for (int i = 0; i < arr.length; i++) {
                arr[i] = generator.nextInt(20);
        }
		mergeSort(0, arr.length - 1);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public void mergeSort(int low, int high){
		if(low < high){
			int middle = low + (high-low)/2;
			mergeSort(low, middle);
			
			mergeSort(middle + 1, high);
			
			merge(low, middle, high);
		}
	}
	
	public void merge(int low, int middle, int high){
		//copy low and high array into helper array
		for(int i = low; i <= high; i++){
			helper[i] = arr[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while(i <= middle && j <= high){
			if(helper[i] > helper[j]){
				arr[k] = helper[i];
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while(i <= middle){
			arr[k] = helper[i];
			i++;
			k++;
		}
		
//		while(j <= high){
//			arr[k] = helper[j];
//			j++;
//			k++;
//		}
	}

}